package org.usfirst.frc.team6078.robot;

import org.usfirst.frc.team6078.robot.constants.*;

import edu.wpi.first.wpilibj.Jaguar;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Defining motors for Drivetrain
	public static Jaguar frontLeftMotor = new Jaguar(Constants.frontLeftMotorPort);	
	public static Jaguar frontRightMotor = new Jaguar(Constants.frontRightMotorPort);
	public static Jaguar backLeftMotor = new Jaguar(Constants.backLeftMotorPort);
	public static Jaguar backRightMotor = new Jaguar(Constants.backRightMotorPort);
	
	//Defining motor for ball intake
	public static Jaguar ballIntake = new Jaguar(Constants.ballIntakePort);
	
	
	
}
