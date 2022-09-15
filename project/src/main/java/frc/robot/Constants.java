// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //mrinali's drivetrain constants
    
    public static double speed;
    public static double leftPwr=0.7;
    public static double rightPwr=0.7;
    public static double intakespeed;
    public static double armspeed;
    public static final int kLeftX = 2;
    public static final int kRightX = 4;
    public static final int kLeftY = 1;
    public static final int kRightY = 5;


    //Axis
    public static final int XBOX_LEFT_Y_AXIS = 1;
    public static final int XBOX_LEFT_X_AXIS = 0;
    public static final int RIGHT_TRIGGER = 3;
    public static final int LEFT_TRIGGER = 2;
    public static final int RIGHT_BUMPER = 4;
    public static final int LEFT_BUMPER = 5;

    
    public static final double INTAKE_SPEED = 0.4;
    public static final int INTAKE = 3;
    public static final int ARM = 6;
    public static final double ARM_SPEED = 0.05;

}
