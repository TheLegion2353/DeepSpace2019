package frc.robot.commands;

import frc.robot.EncoderInterface;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.PIDController;
import edu.wpi.first.wpilibj.command.Command;

public class ArmMove extends Command {

    private final boolean stabilizeArm = false;
    private PIDController pidController;

    private final int minEncoder = 0;
    private final int maxEncoder = 20000;

    private double targetHeight = 0;
    private double lastTargetHeight = -1;

    EncoderInterface encoder;

    public ArmMove() {
        requires(Robot.arm);

        encoder = new EncoderInterface(8, 9, false);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(!stabilizeArm) {
            Robot.arm.moveArm(OI.getTriggerValue(RobotMap.xboxPort2));
            System.out.println(encoder.count());
        }
        else {
            if(targetHeight - encoder.count() > 50 && encoder.count() < maxEncoder && encoder.count() > minEncoder) {
                targetHeight += OI.getTriggerValue(RobotMap.xboxPort2) * 50;

                if(targetHeight != lastTargetHeight) {
                    pidController = new PIDController(targetHeight, 0, 1, 1, 0, 0);
                }

                double inputVoltage = pidController.Update(encoder.count());

                Robot.arm.moveArm(inputVoltage);
            }
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}