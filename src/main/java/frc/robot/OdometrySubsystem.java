package frc.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.DifferentialDriveOdometry;
import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

;

public class OdometrySubsystem extends SubsystemBase {


    // Initialize motor controllers and drive
    WPI_TalonSRX topleft = new WPI_TalonSRX(3);
    WPI_TalonSRX bottomleft = new WPI_TalonSRX(4);

    WPI_TalonSRX topright = new WPI_TalonSRX(2);
    WPI_TalonSRX bottomright = new WPI_TalonSRX(1);

    double gyroangle;

    DifferentialDriveOdometry odometry;

    Rotation2d rotation2d = new Rotation2d();

    AHRS gyro = new AHRS(SPI.Port.kMXP);


    Field2d field = new Field2d();

    @Override
    public void periodic() {
        SmartDashboard.putNumber("topleftpose", topleft.getSelectedSensorPosition());
        SmartDashboard.putNumber("toprightpose", topright.getSelectedSensorPosition());
        SmartDashboard.putNumber("topleftpose", bottomleft.getSelectedSensorPosition());
        SmartDashboard.putNumber("topleftpose", bottomright.getSelectedSensorPosition());
        SmartDashboard.putNumber("gyroangle", gyroangle);


        SmartDashboard.putNumber("gyroangleactual", gyro.getAngle());
        gyroangle = gyro.getAngle();
        if (gyroangle < 0 )
            gyroangle = 360 + gyroangle;
        if (gyroangle > 360)
            gyroangle -= 360;

        odometry.update(Rotation2d.fromDegrees(gyroangle), topleft.getSelectedSensorPosition(), topright.getSelectedSensorPosition());
        field.setRobotPose(odometry.getPoseMeters());

    }


    public void robotInit() {
        gyro.reset();
        topleft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        bottomleft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        topright.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        bottomright.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        topleft.setSelectedSensorPosition(0);
        topright.setSelectedSensorPosition(0);
        bottomleft.setSelectedSensorPosition(0);
        bottomright.setSelectedSensorPosition(0);
        odometry = new DifferentialDriveOdometry(gyro.getRotation2d() );

    }

}
