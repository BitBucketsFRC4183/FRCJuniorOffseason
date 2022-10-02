package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class ButtonSystem {
Joystick joystick = new Joystick(0);


    public boolean moveFoward(){
        return joystick.getRawButton(4);
    }

    public boolean moveBackwards(){
        return joystick.getRawButton(1);
    }
    public boolean moveLeft(){
        return joystick.getRawButton(3);
    }
    public boolean moveRight(){
        return joystick.getRawButton(4);
    }

}

