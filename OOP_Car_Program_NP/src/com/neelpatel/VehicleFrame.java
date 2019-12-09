package com.neelpatel;

public class VehicleFrame implements Chassis {
  String vehicleFrameType;

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return new VehicleChassis();
  }

    @Override
    public String toString() {
        return "VehicleFrame{" +
                "vehicleFrameType='" + vehicleFrameType + '\'' +
                '}';
    }

    @Override
  public void setChassisType(String vehicleChassis) {
    vehicleFrameType = vehicleChassis;
  }
}
