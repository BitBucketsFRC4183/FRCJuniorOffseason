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
        return joystick.getRawAxis(5);
    }

    /**
     * getLR shifts between -1 and 1 (-1 = left; 1 = right)
     * @return getLR is on the right and makes robot move left and right by shifting left and right
    */
    public double getLR()
    {
        return joystick.getRawAxis(4);
    }


}
