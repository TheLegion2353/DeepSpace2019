/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //USB Ports
  public final static int xboxPort1 = 0;
  public final static int xboxPort2 = 1;
  
  public final static int rightArmPort = 7;
  public final static int leftArmPort = 1;

  public final static int rightLeadScrew = 8;
  public final static int leftLeadScrew = 2;
 
  //Drive motor ports
  public final static int frontleftPort = 0;
  public final static int frontrightPort = 5;
  public final static int backleftPort = 3;
  public final static int backrightPort = 6;

  public final static int intakeMotor = 9;

}