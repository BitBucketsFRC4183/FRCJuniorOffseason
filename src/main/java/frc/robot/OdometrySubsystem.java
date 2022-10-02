package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

;

public class OdometrySubsystem {

    Encoder encoder = new Encoder(0, 1, false, CounterBase.EncodingType.k2X);

    // Initialize motor controllers and drive
    WPI_TalonSRX left1 = new WPI_TalonSRX(0);
    WPI_TalonSRX left2 = new WPI_TalonSRX(1);

    WPI_TalonSRX right1 = new WPI_TalonSRX(2);
    WPI_TalonSRX right2 = new WPI_TalonSRX(3);

    MotorControllerGroup leftMotors = new MotorControllerGroup(left1, left2);
    MotorControllerGroup rightMotors = new MotorControllerGroup(right1, right2);


    public void robotInit() {


        right1.getSelectedSensorPosition();
        // Configures the encoder's distance-per-pulse
        // The robot moves forward 1 foot per encoder rotation
        // There are 256 pulses per encoder rotation
        encoder.setDistancePerPulse(1./256.);
    }

}
