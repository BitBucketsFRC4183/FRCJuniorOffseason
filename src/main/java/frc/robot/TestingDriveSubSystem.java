package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestingDriveSubSystem extends SubsystemBase {

    final ButtonSystem buttonSystem;
    WPI_TalonSRX topLeft = new WPI_TalonSRX(3);
    WPI_TalonSRX topRight = new WPI_TalonSRX(4);
    WPI_TalonSRX bottomLeft = new WPI_TalonSRX(2);
    WPI_TalonSRX bottomRight = new WPI_TalonSRX(1);

    public TestingDriveSubSystem(ButtonSystem buttonSystem) {
        this.buttonSystem = buttonSystem;
    }

    public void init()
    {
        moveAll(0.2);
    }

    public void periodic()
    {

    }

    public void moveAll(double power)
    {
        topLeft.set(power);
        topRight.set(power);
        bottomLeft.set(power);
        bottomRight.set(power);

    }
}
