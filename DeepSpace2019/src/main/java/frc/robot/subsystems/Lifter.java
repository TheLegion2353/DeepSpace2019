package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.LifterMove;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lifter extends Subsystem {

    private static Victor rightLeadScrew;
    private static Victor leftLeadScrew;
	
	public Lifter() {
        rightLeadScrew = new Victor(RobotMap.rightLeadScrew);
        leftLeadScrew = new Victor(RobotMap.leftLeadScrew);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new LifterMove());
    }
    
    public static void lift(double speed) {
        rightLeadScrew.set(speed);
        leftLeadScrew.set(speed);
    }
}