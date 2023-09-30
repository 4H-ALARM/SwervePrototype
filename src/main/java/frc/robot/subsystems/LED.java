// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;


public class LED extends SubsystemBase {
  /** Creates a new LED. */
  Spark blinkin1;

  public LED() {
    blinkin1 = new Spark(0);
  }

  public void startLED() {
    blinkin1.set(1.5);
  }

  @Override
  public void periodic() {
    
  }
}
