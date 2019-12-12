package com.neelpatel;

import java.util.Date;

/** @author Neel Patel This program was created for OOP personal project. OOP Car Program */
public class VehicleChassis implements Chassis {
  String chassisName;

  //constructor for objects of class VehicleChassis
  public VehicleChassis() {
    this.chassisName = Chassis.chassis;
  }
//overload constructor
  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  public static void main(String[] args) {
    VehicleChassis vehicleChassis = new VehicleChassis();
    VehicleChassis vehicleChassis1 = new VehicleChassis("chassis name");
    System.out.println(vehicleChassis);
    System.out.println(vehicleChassis1);

    System.out.println("-----------------------------------");

    VehicleFrame vehicleFrame1 = new VehicleFrame();
    System.out.println(vehicleFrame1);
    VehicleFrame vehicleFrame2 = new VehicleFrame("Ladder Frame");
    System.out.println(vehicleFrame2);

    System.out.println("-----------------------------------");

    ManufacturedEngine ManuEngine1 = new ManufacturedEngine();
    System.out.println(ManuEngine1);
    ManufacturedEngine ManuEngine2 = new ManufacturedEngine("Honda",new Date(),"H-Series","H23A1","2WD: Two-wheel Drive","88 AKI",4);
    System.out.println(ManuEngine2);

    System.out.println("-----------------------------------");

    InteriorFeature interiorFeature1 = new InteriorFeature();
    System.out.println(interiorFeature1);
    InteriorFeature interiorFeature2 = new InteriorFeature("Climate Control");
    System.out.println(interiorFeature2);

  }
//getters and setters
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
