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

public class TurretSubsystem extends SubsystemBase {
  CANSparkMax turret;
  RelativeEncoder encoder;
  SparkMaxPIDController controller;
  
  /** Creates a new TurretSubsystem. */
  public TurretSubsystem(double P, double I, double D) {
    turret = new CANSparkMax(5, MotorType.kBrushless);
    encoder = turret.getEncoder();
    controller = turret.getPIDController();
    controller.setP(P);
    controller.setI(I);
    controller.setD(D);
    controller.setOutputRange(-1, 1);
  }

  public void setTurretTarget(double target) {
    controller.setReference(target, ControlType.kPosition);
  }

  public double getTurretPosition() {
    return encoder.getPosition();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
