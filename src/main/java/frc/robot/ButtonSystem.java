package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class ButtonSystem {
    Joystick joystick = new Joystick(0);

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
    public double getLR()
    {
        if (joystick.getRawAxis(4) > 0.1 || joystick.getRawAxis(4) < -0.1) {
            return joystick.getRawAxis(4);
        }
        else {
            return 0;
        }
    }


}
