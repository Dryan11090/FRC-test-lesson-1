package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;

class SwerveModule {

    //This modular will have:
    //motors are l1
    //Drive Motor
    //Turning motor
    // Absolute Encoder

        //Drivemotor
        Talon driveMotor;
        //TurningMotor
        Talon steeringMotor;

    public SwerveModule(
        int driveMotorPort,
        int steeringMotorPort
    ) { 
        driveMotor = new Talon(driveMotorPort);
        steeringMotor = new Talon(steeringMotorPort);
    }
}

