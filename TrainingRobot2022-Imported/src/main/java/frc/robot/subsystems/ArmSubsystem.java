// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;

public class ArmSubsystem extends SubsystemBase {
  CANSparkMax arm;
  RelativeEncoder encoder;
  SparkMaxPIDController controller;
  
  /** Creates a new ArmSubsystem. */
  public ArmSubsystem(double P, double I, double D) {
    arm = new CANSparkMax(4, MotorType.kBrushless);
    encoder = arm.getEncoder();
    controller = arm.getPIDController();
    controller.setP(P);
    controller.setI(I);
    controller.setD(D);
    controller.setOutputRange(-1, 1);
  }

  public void setArmTarget(double target) {
    controller.setReference(target, ControlType.kPosition);
  }

  public double getArmPosition() {
    return encoder.getPosition();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
