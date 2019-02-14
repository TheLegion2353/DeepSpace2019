package frc.robot.commands;

import frc.robot.OI;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeMove extends Command {

    public IntakeMove() {
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(OI.xboxController.getRawButton(OI.AButtonNum)) {
            Robot.intake.moveIntake(0.25);
        }
        else if(OI.xboxController.getRawButton(OI.BButtonNum)) {
            Robot.intake.moveIntake(-0.25);
        }
        else {
            Robot.intake.moveIntake(0);
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