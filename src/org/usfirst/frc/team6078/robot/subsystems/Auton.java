package org.usfirst.frc.team6078.robot.subsystems;

import org.usfirst.frc.team6078.robot.*;

public class Auton {
	
	//Basically replaces RobotDrive for auton use
	public static void autonDrive(int cet) {
		
		RobotMap.frontLeftMotor.set(cet);
		RobotMap.frontRightMotor.set(cet);
		
		RobotMap.backLeftMotor.set(cet);
		RobotMap.backRightMotor.set(cet);
		
		
	}

}
