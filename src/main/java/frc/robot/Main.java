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
   * The startRobot method takes a robot "Supplier", which is the constructor
   * reference "Robot::new". This does not give us a new Robot object yet, 
   * this is a reference to the function that startRobot can use to create
   * our robot object later after the hardware is initialized.
   * WPILib will do all the required initialization of the Roborio or 
   * simulator, depending on the environment we are running on.
   **/
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
