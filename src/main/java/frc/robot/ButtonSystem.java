package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class ButtonSystem {
    //tezt 4
    Joystick joystick = new Joystick(0);

/*drive button testing
    /**
     * getFB shifts between -1 and 1 (-1 = forward; 1 = forward)
     * @return forward backward axis
     */
    public double getFB() {
        if (joystick.getRawAxis(5) > 0.1 || joystick.getRawAxis(5) < -0.1) {
            return joystick.getRawAxis(5);
        }
        else {
            return 0;
        }
    }

    /**
     * getLR shifts between -1 and 1 (-1 = left; 1 = right)
     * @return getLR is on the right and makes robot move left and right by shifting left and right
    */
    /*public double getLR()
    
drive button testing*/

    // motor device number 1 (bottomRight motor)
    // motor device number 2 (topRight motor)
    // motor device number 3 (topLeft motor)
    // motor device number 4 (bottomLeft motor)
    //moveForward is activated by button "Y"
    //moveLeft activated by button "X"
    //moveRight activated by button "B"
    //moveBackwards activated by button "A"

    /*

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
    */

// getX and getY shifts between -1 and 1

    // getX is on the left and makes robot move up and down by shifting up and down
    public double getX() {
        return joystick.getRawAxis(1);
    }

    // getY is on the right and makes robot move left and right by shifting left and right
    public double getY()

    {
        if (joystick.getRawAxis(4) > 0.1 || joystick.getRawAxis(4) < -0.1) {
            return joystick.getRawAxis(4);
        }
        else {
            return 0;
        }
    }

    public boolean isResetGyroPressed() {
        return true;
    }






}
