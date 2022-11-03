package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


// battery is at back
public class DriveSubsystem extends SubsystemBase {

    final ButtonSystem buttonSystem;

    SlewRateLimiter filterFB = new SlewRateLimiter(5); //high number -> accelerates faster
    SlewRateLimiter filterLR = new SlewRateLimiter(5); //low number -> starts to not really move (0.1 makes it not move at all)

    WPI_TalonSRX topRight = new WPI_TalonSRX(4);
    WPI_TalonSRX bottomRight = new WPI_TalonSRX(1);


    MotorControllerGroup right = new MotorControllerGroup(topRight, bottomRight);

    WPI_TalonSRX topLeft = new WPI_TalonSRX(3);
    WPI_TalonSRX bottomLeft = new WPI_TalonSRX(2);

    MotorControllerGroup left = new MotorControllerGroup(topLeft, bottomLeft);


    DifferentialDrive drive = new DifferentialDrive(left, right);


    public DriveSubsystem(ButtonSystem buttonSystem) {
        this.buttonSystem = buttonSystem;
    }



    public void init() {
        topRight.setInverted(true);
        bottomRight.setInverted(true);
    }




    public void periodic() {



        // Arcade drive with a given forward and turn rate
        drive.arcadeDrive(filterFB.calculate(buttonSystem.getFB()*0.75), filterLR.calculate(-buttonSystem.getLR()*0.75));
        //drive.tankDrive(filterFB.calculate(buttonSystem.getFB()*0.75), filterLR.calculate(-buttonSystem.getLR()*0.75));


    }


}
