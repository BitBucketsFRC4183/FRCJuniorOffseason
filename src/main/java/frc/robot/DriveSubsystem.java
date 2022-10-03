package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
    // motor device number 1 (bottomRight motor)
    // motor device number 2 (topRight motor)
    // motor device number 3 (topLeft motor)
    // motor device number 4 (bottomLeft motor)
    //forward is activated by button "Y"
    //turnLeft activated by button "X"
    //turnRight activated by button "B"
    //reverse activated by button "A"



    final ButtonSystem buttonSystem = new ButtonSystem();
    WPI_TalonSRX topLeft = new WPI_TalonSRX(3);
    WPI_TalonSRX topRight = new WPI_TalonSRX(2);
    WPI_TalonSRX bottomLeft = new WPI_TalonSRX(4);
    WPI_TalonSRX bottomRight = new WPI_TalonSRX(1);




    public void periodic() {

        System.out.println("periodic");

        if (buttonSystem.moveLeft()) {
            turnLeft();
        }

        else if (buttonSystem.moveForward()) {
            forward();
        }

       else if (buttonSystem.moveRight()) {
            turnRight();
        }

       else if (buttonSystem.moveBackwards()) {
            reverse();
        }

       else {
            topLeft.set(0);
            topRight.set(0);
            bottomRight.set(0);
            bottomLeft.set(0);
        }
    }


    public void forward() {

        topLeft.set(0.3);
        topRight.set(0.3);
        bottomRight.set(0.3);
        bottomLeft.set(0.3);
    }


    public void turnLeft() {
        topLeft.set(0.2);
    }


    public void turnRight() {
        topRight.set(0.2);
    }


    public void reverse() {
        topLeft.set(-0.3);
        topRight.set(-0.3);
        bottomRight.set(-0.3);
        bottomLeft.set(-0.3);
    }


}
