package frc.robot.command;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.DriveSubsystem;

public class basicRoutine extends SequentialCommandGroup{
    public basicRoutine(DriveSubsystem driveSubsystem) {
        super(
                new MoveForward(driveSubsystem), new MoveRight(driveSubsystem), new MoveForward(driveSubsystem)
        );
    }

}
