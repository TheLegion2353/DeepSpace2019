package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.DriveMove;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;


public class Drive extends Subsystem {

	private static Talon frontLeftMotor;
    private static Talon frontRightMotor;
    private static Talon backLeftMotor;
    private static Talon backRightMotor;

    private static RobotDrive drive;

	public Drive() {
        frontLeftMotor = new Talon(RobotMap.frontleftPort);
        frontRightMotor = new Talon(RobotMap.frontrightPort);
        backLeftMotor = new Talon(RobotMap.backleftPort);
        backRightMotor = new Talon(RobotMap.backrightPort);

        drive = new RobotDrive(frontLeftMotor, backLeftMotor,frontRightMotor, backRightMotor);
   	
		drive.setInvertedMotor(MotorType.kFrontLeft, true);
		drive.setInvertedMotor(MotorType.kRearLeft, true);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new DriveMove());
    }
    
    public static void driveMove(double x, double y, double rotation, double gyro) {
        drive.mecanumDrive_Cartesian(x, y, rotation, gyro);
    }
}
