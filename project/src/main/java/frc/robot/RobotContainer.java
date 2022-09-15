// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.DriveWithJoysticks;
import frc.robot.commands.IntakeObject;
import frc.robot.commands.LowerArm;
import frc.robot.commands.Outtake;
import frc.robot.commands.RaiseArm;
//import frc.robot.commands.IntakeBall;
//import frc.robot.commands.LowerArm;
//import frc.robot.commands.Outtake;
//import frc.robot.commands.RaiseArm;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Arm;

//import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private final Joystick joystick = new Joystick(1);
  private final DriveTrain m_driveTrain = new DriveTrain();
  private final DriveWithJoysticks driveWithJoystick = new DriveWithJoysticks(m_driveTrain);
  public static final XboxController controller = new XboxController(5);


  private final Intake intake = new Intake();
  private final IntakeObject intakeobject = new IntakeObject(intake);
  private final Outtake outtake = new Outtake(intake);

  private final Arm arm = new Arm();
  private final LowerArm lowerarm = new LowerArm(arm);
  private final RaiseArm raisearm = new RaiseArm(arm);


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureButtonBindings();
  }



  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    JoystickButton intakeButton = new JoystickButton(joystick, XboxController.Button.kA.value);
    intakeButton.whileHeld(intakeobject);

    JoystickButton outtakeButton = new JoystickButton(joystick, XboxController.Button.kB.value);
    outtakeButton.whileHeld(outtake);

    JoystickButton raiseButton = new JoystickButton(joystick, XboxController.Button.kX.value);
    raiseButton.whileHeld(raisearm);

    JoystickButton lowerButton = new JoystickButton(joystick, XboxController.Button.kY.value);
    lowerButton.whileHeld(lowerarm);
  }
  


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  
}
