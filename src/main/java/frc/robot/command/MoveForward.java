package frc.robot.command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.DriveSubsystem;

public class MoveForward extends CommandBase {

    int counter = 0;
    final DriveSubsystem driveSubsystem;

    public MoveForward(DriveSubsystem driveSubsystem) {
        this.driveSubsystem = driveSubsystem;
    }

    @Override
    public boolean isFinished() {
        return (counter >= 100);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        counter += 1;
        driveSubsystem.move(1.0);
        System.out.println("Working...");
    }
}
