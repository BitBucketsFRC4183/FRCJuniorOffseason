// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


/**
 * The VM is configured to automatically run this class, and to call the methods corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot
{
  ButtonSystem buttonSystem = new ButtonSystem();
  DriveSubsystem driveSubsystem = new DriveSubsystem(buttonSystem);
  TestingDriveSubSystem testingDriveSubSystem = new TestingDriveSubSystem(buttonSystem);

  OdometrySubsystem odometrySubsystem = new OdometrySubsystem();

  @Override
  public void robotInit() {
    odometrySubsystem.robotInit();

  }

  @Override
  public void teleopPeriodic() {
    driveSubsystem.periodic();
    //testingDriveSubSystem.periodic();
  }

  @Override
  public void teleopInit() {

    driveSubsystem.init();
    //testingDriveSubSystem.init();
  }
}
