package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.RollerMove;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Drive extends Subsystem {

	private static Talon frontleftMotor;
    private static Talon frontrightMotor;
    private static Talon backleftMotor;
    private static Talon backrightMotor;

	public Drive() {
        frontleftMotor = new Talon(RobotMap.frontleftPort);
        frontrightMotor = new Talon(RobotMap.frontrightPort);
        backleftMotor = new Talon(RobotMap.backleftPort);
        backrightMotor = new Talon(RobotMap.backrightPort); 
	}

    public void initDefaultCommand() {
        setDefaultCommand(new DriveMove());
    }
    
    public static void driveMove(double speed) {
        frontleftMotor.set(speed); 
        frontrightMotor.set(speed);
        backleftMotor.set(-speed);
        backrightMotor.set(-speed);
    }
}
