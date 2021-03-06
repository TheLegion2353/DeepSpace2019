package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.IntakeMove;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Intake extends Subsystem {

    private static Victor primaryWheel; 

	public Intake() {
        primaryWheel = new Victor(RobotMap.intakeMotor);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new IntakeMove());
    }
    
    public static void moveIntake(double speed) {
        primaryWheel.set(speed);
    }
}
