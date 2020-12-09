package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all.
 * Unless you know what you are doing, do not modify this file except to
 * change the parameter class to the startRobot call.
 */
public final class Main {
  private Main() {
  }

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * If you change your main robot class, change the parameter type.
   */
  
  /**
   * This is the standard main function as required by Java. The JVM looks for
   * this method as the starting point for execution.
   * We instanstiate a new robot from our Robot class in the Robot.java file 
   * using a constructor reference (Robot::new) and
   * pass it into the startRobot method from WPIlib. WPILib will do all the
   * required initialization of the Roborio or simulator, depending on the 
   * environment we are running on.
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
