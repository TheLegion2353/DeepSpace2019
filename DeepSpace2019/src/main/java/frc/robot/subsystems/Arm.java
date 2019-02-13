package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.ArmMove;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Arm extends Subsystem {

    private static Talon leftArmMotor;
    private static Talon rightArmMotor;
    
	public Arm() {
        leftArmMotor = new Talon(RobotMap.leftArmPort);
        rightArmMotor = new Talon(RobotMap.rightArmPort);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new ArmMove());
    }
    
    public static void moveArm(double speed) {
        leftArmMotor.set(speed);
        rightArmMotor.set(-speed);
    }
}
