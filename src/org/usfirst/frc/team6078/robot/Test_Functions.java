package org.usfirst.frc.team6078.robot;

import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Test_Functions {
	
	public static void wiggleMotors() {
		
		SmartDashboard.putString("Front Left Motor Wiggle","Wiggle Front Left Motor");
		RobotMap.frontLeftMotor.set(1);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RobotMap.frontLeftMotor.set(0);
		
		SmartDashboard.putString("Front Right Motor Wiggle","Wiggle Front Right Motor");
		RobotMap.frontRightMotor.set(1);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RobotMap.frontRightMotor.set(0);
		
		SmartDashboard.putString("Back Right Motor Wiggle","Wiggle Back Right Motor");
		RobotMap.backRightMotor.set(1);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RobotMap.backRightMotor.set(0);

		SmartDashboard.putString("Back Left Motor Wiggle","Wiggle Back Left Motor");
		RobotMap.backLeftMotor.set(1);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RobotMap.backLeftMotor.set(0);
	}
}
