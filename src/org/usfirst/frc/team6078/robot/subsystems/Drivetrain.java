package org.usfirst.frc.team6078.robot.subsystems;

import org.usfirst.frc.team6078.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;

public class Drivetrain {
	
	public static class  drivetrainV1 {
	
		public static RobotDrive drive = new RobotDrive(RobotMap.frontLeftMotor, RobotMap.frontRightMotor, RobotMap.backLeftMotor, RobotMap.backRightMotor);
	
	}
	
	public static void alernateDrive(int cet) {
			
			RobotMap.frontLeftMotor.set(cet);
			RobotMap.frontRightMotor.set(cet);
			
			RobotMap.backLeftMotor.set(cet);
			RobotMap.backRightMotor.set(cet);
			
	}
}
