package frc.robot.subsystems;

import frc.robot.Constants.GearRunnerConstants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class GearRunner extends SubsystemBase {
    private TalonFX mJointMotor;
    private TalonFX mIntakeMotor;

    public GearRunner() {
        mJointMotor = new TalonFX(GearRunnerConstants.jointID);
        mIntakeMotor = new TalonFX(GearRunnerConstants.intakeID);
    }

    public void jointUp() {
        intakeStop();
        mJointMotor.set(ControlMode.Position, GearRunnerConstants.jointUpPos);
    }

    public void jointDown() {
        mJointMotor.set(ControlMode.Position, GearRunnerConstants.jointDownPos);
    }

    public void intakeIn() {
        mIntakeMotor.set(ControlMode.Velocity, GearRunnerConstants.intakeInVelocity);
    }

    public void intakeOut() {
        mIntakeMotor.set(ControlMode.Velocity, GearRunnerConstants.intakeOutVelocity);
    }

    public void intakeStop() {
        mIntakeMotor.set(ControlMode.Velocity, 0);
    }
}
