/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
	public static Joystick xboxController1;
	public static Joystick xboxController2;

	// Xbox Button mappings
	public final static int AButtonNum = 1;
	public final static int BButtonNum = 2;
	public final static int YButtonNum = 4;
	public final static int XButtonNum = 3;
	public final static int left_Bumper = 5;
	public final static int right_Bumper = 6;
	public final static int select_Button = 6;
	public final static int start_Button = 7;

	// Xbox axis numbers
	public final static int leftYAxis = 1;
	public final static int leftXAxis = 0;
	public final static int rightYAxis = 5;
	public final static int rightXAxis = 4;

	public final static int left_Trigger = 2;
	public final static int right_Trigger = 3;

	public JoystickButton AButton, BButton, YButton, XButton;

	public OI() {
		xboxController1 = new Joystick(RobotMap.xboxPort1);
		xboxController2 = new Joystick(RobotMap.xboxPort1);
	}

	public static double getXboxLeftXAxis(int controller) {
		double x_axis = 0;

		if(controller == RobotMap.xboxPort1) {
			x_axis = xboxController1.getRawAxis(leftXAxis);
		}
		else if(controller == RobotMap.xboxPort2) {
			x_axis = xboxController2.getRawAxis(leftXAxis);
		}

		if (x_axis > -.2 && x_axis < .2)
			x_axis = 0;

		return x_axis;
		
	}

	public static double getXboxLeftYAxis(int controller) {
		double y_axis = 0;

		if(controller == RobotMap.xboxPort1) {
			y_axis = xboxController1.getRawAxis(leftYAxis);
		}
		else if(controller == RobotMap.xboxPort2) {
			y_axis = xboxController2.getRawAxis(leftYAxis);
		}

		if (y_axis > -.2 && y_axis < .2)
			y_axis = 0;

		return -y_axis;
	}

	public static double getXboxRightXAxis(int controller) {
		double x_axis = 0;

		if(controller == RobotMap.xboxPort1) {
			x_axis = xboxController1.getRawAxis(rightXAxis);
		}
		else if(controller == RobotMap.xboxPort2) {
			x_axis = xboxController2.getRawAxis(rightXAxis);
		}

		if (x_axis > -.2 && x_axis < .2)
			x_axis = 0;

		return -x_axis;
	}

	public static double getTriggerValue(int controller) {
		double leftTriggerSpeed = 0;
		double rightTriggerSpeed = 0;

		if(controller == RobotMap.xboxPort1) {
			leftTriggerSpeed = xboxController1.getRawAxis(left_Trigger);
			rightTriggerSpeed = xboxController1.getRawAxis(right_Trigger);
		}
		else if(controller == RobotMap.xboxPort2) {
			leftTriggerSpeed = xboxController2.getRawAxis(left_Trigger);
			rightTriggerSpeed = xboxController2.getRawAxis(right_Trigger);
		}

		if (leftTriggerSpeed < .1) {
			leftTriggerSpeed = 0;
		}

		if (rightTriggerSpeed < .1) {
			rightTriggerSpeed = 0;
		}

		double triggerSpeed = rightTriggerSpeed - leftTriggerSpeed;

		return triggerSpeed;
	}
}
