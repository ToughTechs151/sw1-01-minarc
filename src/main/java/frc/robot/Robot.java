package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {
    private final PWMVictorSPX m_leftMotor = new PWMVictorSPX(0);
    private final PWMVictorSPX m_rightMotor = new PWMVictorSPX(1);
    private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
    private final Joystick m_stick = new Joystick(0);
  
    @Override
    public void teleopPeriodic() {
      // Drive with arcade drive.
      // That means that the Y axis drives forward
      // and backward, and the X turns left and right.
      m_robotDrive.arcadeDrive((m_stick.getTop()) ? 1 : 0, 0);
    }
  }