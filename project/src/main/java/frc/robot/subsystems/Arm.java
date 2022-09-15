package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Arm extends SubsystemBase{
    private final CANSparkMax arm = new CANSparkMax(5, MotorType.kBrushless);

    public Arm() {
        arm.set(0);
        arm.setInverted(true);
    }

    @Override
    public void periodic() {
    // This method will be called once per scheduler run
    }

    public static void liftArm(double speed) {
        arm.set(speed);
    }

    public static void lowerArm(double speed) {
        arm.set(-speed);
    }

    public static void stop(){
        arm.set(0);
    }
}
