package org.usfirst.frc.team6078.robot.drivetrain;

import org.usfirst.frc.team6078.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;

public class Drivetrain {
	
	public static class  DrivetrainV1 {
	
		public static RobotDrive drive = new RobotDrive(RobotMap.frontLeftMotor, RobotMap.frontRightMotor, RobotMap.backLeftMotor, RobotMap.backRightMotor);
	
	}
}
