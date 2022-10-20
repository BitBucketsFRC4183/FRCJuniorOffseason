package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

// battery is at back
public class DriveSubsystem extends SubsystemBase {

    final ButtonSystem buttonSystem;
    WPI_TalonSRX topLeft = new WPI_TalonSRX(3);
    WPI_TalonSRX topRight = new WPI_TalonSRX(4);
    WPI_TalonSRX bottomLeft = new WPI_TalonSRX(2);
    WPI_TalonSRX bottomRight = new WPI_TalonSRX(1);

    public DriveSubsystem(ButtonSystem buttonSystem) {
        this.buttonSystem = buttonSystem;
    }



    public void init() {
        topRight.setInverted(true);
        bottomRight.setInverted(true);
    }




    public void periodic() {


        if (buttonSystem.getFB() > 0.1 || buttonSystem.getFB() < -0.1)
        {
            move(buttonSystem.getFB());
        }
        else {
            move(0);
        }

/*
        if(buttonSystem.getLR() > 0.1)
        {
            turnRight(buttonSystem.getLR());
        }


        if(buttonSystem.getLR() < -0.1)
        {
            turnLeft(buttonSystem.getLR());
        }

 */





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
        topRight.set(power/2);
        bottomRight.set(power/2);
        bottomLeft.set(power);
    }

    public void turnLeft(double power)
    {
        topLeft.set(power/2);
        topRight.set(power);
        bottomRight.set(power);
        bottomLeft.set(power/2);
    }






}
