package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class ButtonSystem {
    //tezt
    Joystick joystick = new Joystick(0);


    // motor device number 1 (bottomRight motor)
    // motor device number 2 (topRight motor)
    // motor device number 3 (topLeft motor)
    // motor device number 4 (bottomLeft motor)
    //moveForward is activated by button "Y"
    //moveLeft activated by button "X"
    //moveRight activated by button "B"
    //moveBackwards activated by button "A"

    public boolean moveForward(){
        return joystick.getRawButton(4);
    }

    public boolean moveBackwards(){
        return joystick.getRawButton(1);
    }
    public boolean moveLeft(){
        return joystick.getRawButton(3);
    }
    public boolean moveRight(){
        return joystick.getRawButton(2);
    }

}

