// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.*;

public class DriveTrain extends SubsystemBase {
  WPI_TalonFX talonLFront = new WPI_TalonFX(3);
  WPI_TalonFX talonRFront = new WPI_TalonFX(1);
  WPI_TalonFX talonLBack = new WPI_TalonFX(4);
  WPI_TalonFX talonRBack = new WPI_TalonFX(2);

  MotorControllerGroup leftMotors = new MotorControllerGroup(talonLFront, talonLBack);
  MotorControllerGroup rightMotors = new MotorControllerGroup(talonRFront, talonRBack);

  DifferentialDrive m_drive = new DifferentialDrive(leftMotors, rightMotors);

  /** Creates a new DriveTrain. */
  public DriveTrain() {
    leftMotors.setInverted(false);
    rightMotors.setInverted(true);

    leftMotors.set(0);
    rightMotors.set(0);
  }

  public void stop() {
    leftMotors.stopMotor();
    rightMotors.stopMotor();
  }

  public void arcadeDrive(double speed, double rot) {
    m_drive.arcadeDrive(speed, rot);
  }

  public void tankDrive(){
    m_drive.tankDrive(Constants.leftPwr, Constants.rightPwr);
  }

  public void tankDrive(double speedMultiplier){
    m_drive.tankDrive(speedMultiplier * Constants.leftPwr, speedMultiplier * Constants.rightPwr);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


}
