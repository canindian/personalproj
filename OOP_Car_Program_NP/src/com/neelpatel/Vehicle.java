package com.neelpatel;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  String vehicleType;
  String driveTrain;
  Chassis vehicleFrame;
  Engine vehicleEngine;

  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleFrame = new VehicleFrame();
    this.vehicleType = "None";
    this.vehicleManufacturer = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("88 AKI");
    this.vehicleEngine.setDriveTrain("2ndL Two-wheel Drive");
  }

  public Vehicle(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleType = vehicleType;
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
      this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
      this.vehicleEngine.setEngineType(fuel);
  }

    @Override
    public String toString() {
        return
                "Manufacturer Name: " + vehicleManufacturer + "\n"+
                "Manufactured Date: " + this.vehicleManufacturedDate.toString()+ "\n"+
                "Vehicle Make:" + this.vehicleMake + "\n"+
                "Vehicle Model: " + this.vehicleModel + "\n"+
                " Vehicle Type: " + this.vehicleType + "\n"+
               vehicleEngine.toString() ;
    }
}
