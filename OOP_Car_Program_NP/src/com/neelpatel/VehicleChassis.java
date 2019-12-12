package com.neelpatel;

/** @author Neel Patel This program was created for OOP personal project. OOP Car Program */
public class VehicleChassis implements Chassis {
  String chassisName;

  // constructor for objects of class VehicleChassis
  public VehicleChassis() {
    this.chassisName = Chassis.chassis;
  }
  // overload constructor
  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  // getters and setters
  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  @Override
  public String toString() {
    return "Chassis Name: " + this.chassisName;
  }
}
