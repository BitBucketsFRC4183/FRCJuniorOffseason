package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class ButtonSystem {
    Joystick joystick = new Joystick(0);


    // motor device number 1 (bottomRight motor)
    // motor device number 2 (topRight motor)
    // motor device number 3 (topLeft motor)
    // motor device number 4 (bottomLeft motor)


    /*

    public boolean moveForward(){
        return joystick.getRawButton(4);
    }

    public double getFB() {
        return joystick.getRawAxis(5);
    }

    public double getLR(){
        return joystick.getRawAxis(4);
    }
    */

// getFB and getLR shifts between -1 and 1

    // getFB is on the right and makes robot forwards and backwards by shifting up and down
    public double getFB() {
        return joystick.getRawAxis(1);
    }

    // getLR is on the right and makes robot move left and right by shifting left and right
    public double getLR()
    {
        return joystick.getRawAxis(4);
    }


}

// hi