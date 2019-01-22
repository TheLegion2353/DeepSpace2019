package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.RollerMove;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Roller extends Subsystem {

	private static Talon rollerMotor;
	
	public Roller() {
		rollerMotor = new Talon(RobotMap.rollerMotor);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new RollerMove());
    }
    
    public static void rollerMove(double speed) {
    	rollerMove.set(speed);
    }
}
