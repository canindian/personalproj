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



  public static void main(String[] args) {
    VehicleFrame vehicleFrame1 = new VehicleFrame();
    System.out.println(vehicleFrame1);

    // testing overload constructor
    VehicleFrame vehicleFrame2 = new VehicleFrame("Ladder Frame");
    System.out.println(vehicleFrame2);


  }
}
