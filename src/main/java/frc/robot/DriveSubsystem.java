package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class DriveSubsystem extends SubsystemBase {
    /*
    motor device number 1 (bottomRight motor)
    motor device number 2 (topRight motor)
    motor device number 3 (topLeft motor)
    motor device number 4 (bottomLeft motor)
    */

    final ButtonSystem buttonSystem;
    WPI_TalonSRX topLeft = new WPI_TalonSRX(3);
    WPI_TalonSRX topRight = new WPI_TalonSRX(2);
    WPI_TalonSRX bottomLeft = new WPI_TalonSRX(4);
    WPI_TalonSRX bottomRight = new WPI_TalonSRX(1);

    public DriveSubsystem(ButtonSystem buttonSystem) {
        this.buttonSystem = buttonSystem;
    }


    public void init() {
       // topLeft.setInverted(true);
        //bottomLeft.setInverted(true);
    }




    public void periodic() {

        move(buttonSystem.getFB());

        if(buttonSystem.getLR() > 0)
        {
            turnRight(buttonSystem.getLR());
        }


        if(buttonSystem.getLR() < 0)
        {
            turnLeft(buttonSystem.getLR());
        }
    }



    public void move(double power)
    {
        topLeft.set(power);
        topRight.set(power);
        bottomRight.set(power);
        bottomLeft.set(power);
    }

    public void turnRight(double power)
    {
        topLeft.set(power);
        topRight.set(power/1.5);
        bottomRight.set(power/1.5);
        bottomLeft.set(power);
    }

    public void turnLeft(double power)
    {
        topLeft.set(power/1.5);
        topRight.set(power);
        bottomRight.set(power);
        bottomLeft.set(power/1.5);
    }





}
