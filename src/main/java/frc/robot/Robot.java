package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {
    /**
     * We build the robot from from the ground up, one component at a time. 
     * We put the objects we create into variable for use later. By convention
     * variables that hold objects like this are named with a begining "m_".
     * There is nothing special about this, it just makes it easy to recognize
     * them in other contexts.
     *
     * Some teams place this type of stuff in a separate file or put the object 
     * creation in the files where they will be used, but there are two advantages
     * to putting them all in one place like this. One is that you always know where
     * to find them when you want to change them. If we decided to use a different
     * type of motor for instance, we would need to change it and you would know
     * that it has to be changed here. Otherwise you might need to look through 
     * a bunch of files to find the places where the motor is assigned.
     *
     * The other advantage is that it makes it easy to build and use a test framework
     * We don't currently do this, but it is better to get used to this style rather
     * than having to change it later. 
     * 
     * Another thing to note. In this example we were trying to create the simplest 
     * robot possible. Normally we would not hard code the port numbers into the 
     * objects we create. Instead we would use a serious of constants that we 
     * would define for the purpose. These contants would have descriptive names
     * so that it is more obvious what they represent. We put them all together 
     * in the file so it is easier to verify that we don't have any collisions. 
     * In some of the WPIlib examples these constants will be in a separate file
     * called robotMap.java. It is not necessary to have this be a separate file, 
     * but it can be useful, especially if you want to have more than one 
     * configuration you want to use, i.e. if you have different robots with 
     * different ports.
     **/
    /* Create and assign the two drive motors. */
    private final PWMVictorSPX m_leftMotor = new PWMVictorSPX(0);
    private final PWMVictorSPX m_rightMotor = new PWMVictorSPX(1);
    /* Put the drive motors we just created into a new Differential Drive object */
    private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
    /* Get the joystick object we will be reading to control the drive. */
    private final Joystick m_stick = new Joystick(0);
  
    @Override
    public void teleopPeriodic() {
      // Drive with arcade drive.
      // That means that the Y axis drives forward
      // and backward, and the X turns left and right.
      m_robotDrive.arcadeDrive(m_stick.getY(), m_stick.getX());
    }
  }
