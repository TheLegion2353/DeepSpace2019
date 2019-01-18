package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.ArmMove;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Arm extends Subsystem {

	private static Talon armMotor;
	
	public Arm() {
		armMotor = new Talon(RobotMap.armPort);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new ArmMove());
    }
    
    public static void moveArm(double speed) {
    	armMotor.set(speed);
    }
}
