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
  public final static int xboxPort = 0;
  
  public final static int armPort = 1;

  public final static int rollerPort = 2;
 
  //Drive motor ports
  public final static int frontleftPort = 3;
  public final static int frontrightPort = 4;
  public final static int backleftPort = 5;
  public final static int backrightPort = 6;

}
