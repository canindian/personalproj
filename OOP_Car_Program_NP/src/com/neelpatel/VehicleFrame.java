package com.neelpatel;

public class VehicleFrame implements Chassis {
  String vehicleFrameType;

public VehicleFrame(){
    this.vehicleFrameType = "Uni-body";
}
public VehicleFrame(String vehicleFrameType){
    this.vehicleFrameType = vehicleFrameType;
}
    @Override
    public Chassis getChassisType() {
        return this;
    }
    @Override
    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }
    @Override
    public String toString() {
        return "Chassis: " + Chassis.chassis + "\n" + "Vehicle Frame: " + this.vehicleFrameType;
    }

}
