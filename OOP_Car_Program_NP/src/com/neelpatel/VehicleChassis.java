package com.neelpatel;
/** @author Neel Patel This program was created for OOP personal project. OOP Car Program */

public class VehicleChassis implements Chassis {
    String chassisName;

    public VehicleChassis() {
        this.chassisName = chassis;
    }

    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    public static void main(String[] args) {
        VehicleChassis vehicleChassis = new VehicleChassis();
        VehicleChassis vehicleChassis1 = new VehicleChassis("chasis name");
        System.out.println(vehicleChassis);
        System.out.println(vehicleChassis1);
    }

    @Override
    public Chassis getChassisType() {
        return new VehicleChassis();
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        chassisName = vehicleChassis;
    }

    @Override
    public String toString() {
        return "Chassis Name : " + chassisName;
    }
}

