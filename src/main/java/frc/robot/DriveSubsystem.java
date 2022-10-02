package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
    // motor device number 1 (bottomRight motor) --- controlled by "A" on the xBox Controller
    // motor device number 2 (topRight motor) --- controlled by "B" on the xBox Controller
    // motor device number 3 (topLeft motor) turns it  lefts --- controlled by "X" on the xBox Controller
    // motor device number 4 (bottomLeft motor) --- controlled by "Y" on the xBox Controller
    final ButtonSystem buttonSystem = new ButtonSystem();
    WPI_TalonSRX topLeft = new WPI_TalonSRX(3);
    WPI_TalonSRX topRight = new WPI_TalonSRX(2);
    WPI_TalonSRX bottomLeft = new WPI_TalonSRX(4);
    WPI_TalonSRX bottomRight = new WPI_TalonSRX(1);


    public void periodic() {

        if (buttonSystem.moveForward()) {
            forward();
        }

        if (buttonSystem.moveLeft()) {
            turnLeft();
        }

        if (buttonSystem.moveRight()) {
            turnRight();
        }

        if (buttonSystem.moveBackwards()) {
            reverse();
        }
    }

    public void forward() {

        topLeft.set(1);
        topRight.set(1);
        bottomRight.set(1);
        bottomLeft.set(1);
    }

    public void turnLeft() {
        topLeft.set(0.2);
    }

    public void turnRight() {
        topRight.set(0.2);
    }

    public void reverse() {
        topLeft.set(-1);
        topRight.set(-1);
        bottomRight.set(-1);
        bottomLeft.set(-1);
    }


}
