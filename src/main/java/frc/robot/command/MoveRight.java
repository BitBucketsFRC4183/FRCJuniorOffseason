package frc.robot.command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.DriveSubsystem;

public class MoveRight extends CommandBase{

    int counter = 0;
    final DriveSubsystem driveSubsystem;

    public MoveRight(DriveSubsystem driveSubsystem) {
        this.driveSubsystem = driveSubsystem;
    }

    @Override
    public boolean isFinished() {
        counter += 1;
        return (counter >= 2000);
    }

    @Override
    public void execute() {
        System.out.println("Right has started");
    }
}
