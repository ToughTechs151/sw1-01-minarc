package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
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
     *
     * We can also create a Constants.java file where we put other contants used
     * by the robot. Anytime you type a number into robot code you should consider
     * whether that number should be changed to a variable from the RobotMap.java
     * file or a variable from the Constants.java file. If the number represents
     * something in the robot configuration, put it in the RobotMap file. If a number
     * needs to change in concert with something else or is used in more than one
     * place, put it in the Constants.java file and add comments that document the
     * relationships and anything else about the constant. Don't over do it. If 
     * a number is only used in one place you can define the variable in the same
     * class and keep it there. Remember to add comments though.
     **/
    /* Create and assign the two drive motors. */
    private final PWMVictorSPX m_leftMotor = new PWMVictorSPX(0);
    private final PWMVictorSPX m_rightMotor = new PWMVictorSPX(1);
    /* Put the drive motors we just created into a new Differential Drive object */
    private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
    /* Get the joystick object we will be reading to control the drive. */
    private final Joystick m_stick = new Joystick(0);
  
    @Override
    public void robotInit()  {
      /* WPILib used to invert the right motor automatically, but no more. Do it ourselves. */
      m_rightMotor.setInverted(true);
    }

    @Override
    public void teleopPeriodic() {
      /**
       * In this extremly simple example we don't actually follow the standard
       * Command Robot pattern. With the CRP we divide the robot code into 
       * separate parts and put them in separate folders. We have a subsystems 
       * folder where we put all the code for each of the subsystems. Likewise
       * we have a folder called "commands" were we put all of the separate 
       * robot commands. We call the scheduler to run our commands and the 
       * commands in turn tell the scheduler what subsystems the commands 
       * want to use. In this example we don't do any of that, instead we
       * only have one subsystem, the differential drive, and one thing we
       * want it to do, which is to set the drive motor speed based on the 
       * current joystick values, using all the defaults. We use the 
       * teleopPeriodic function (which gets called every 20ms) to read the 
       * current joystick value and pass that to the drive system to run 
       * the motors. Notice that since we set the motors every 20ms we do not 
       * have to worry about the safety watchdog timer. 
       **/
      // Drive with arcade drive.
      // That means that the Y axis drives forward
      // and backward, and the X turns left and right.
      m_robotDrive.arcadeDrive(m_stick.getY(), m_stick.getX());
    }
  }
