package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// battery is at back
public class DriveSubsystem extends SubsystemBase {

    final ButtonSystem buttonSystem;

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




/* drive button
    public void periodic() {



        // Arcade drive with a given forward and turn rate
        drive.arcadeDrive(buttonSystem.getFB(), -buttonSystem.getLR());

drive button*/
       public void move(double power)
    {
        topLeft.set(power);
        topRight.set(power);
        bottomRight.set(power);
        bottomLeft.set(power);
    }


    }


}
