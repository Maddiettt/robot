// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  private final CANSparkMax intake = new CANSparkMax(6, MotorType.kBrushless);


  /** Creates a new Intake. */
  public Intake() {
    intake.set(0);
    intake.setInverted(false);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void in(double speed) {
    intake.set(speed);
  }

  public static void out(double speed) {
    intake.set(-speed);
  }

  public static void stop(){
    intake.set(0);
  }
}
