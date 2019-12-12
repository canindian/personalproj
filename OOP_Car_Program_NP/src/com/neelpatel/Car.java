package com.neelpatel;

import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxel;

  public Car() {
    super();

    Feature[] features = {
      new InteriorFeature("No Interior Features"), new ExteriorFeature("No Exterior Features")
    };
    this.feature = features;
    this.carAxel = 2;
  }

  public Car(
      Date vehicleMake,
      String vehicleManufacturer,
      String vehicleType,
      String vehicleModel,
      String vehicleManufacturedDate,
      Chassis vehicleFrame,
      Engine vehicleEngine,
      Feature[] feature,
      int carAxel) {
    super(
        vehicleMake,
        vehicleManufacturer,
        vehicleModel,
        vehicleManufacturedDate,
        vehicleType,
        vehicleFrame,
        vehicleEngine);
    this.feature = feature;
    this.carAxel = carAxel;
  }

  public String getExteriorFeatures() {
    String set = "";
    for (Feature value : this.feature) {
      if (set.length() == 0) {
        set += value;
      } else {
        set += "\n : " + value;
      }
    }
    return set;
  }

  public String getInteriorFeatures() {
    String set = "";
    for (Feature value : this.feature) {
      if (set.length() == 0) {
        set += value;
      } else {
        set += "\n : " + value;
      }
    }
    return set;
  }
  Feature[] f = { new InteriorFeature("AM/FM Radio"),
          new InteriorFeature("Air Conditioning"),
          new ExteriorFeature("Wood Panels"),
          new ExteriorFeature("Moonroof")};

  public String toString() {
    String set = "";
    for (Feature value : this.feature) {
      if (set.length() == 0) {
        set += value;
      } else {
        set += "\n : " + value;
      }
    }
    return super.toString() + "\n" + "Features: " + set + "\n" + "Car Axel: " + carAxel;
  }
}
