package com.neelpatel;

        import java.util.Date;

public class ManufacturedEngine implements Engine {
    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinder;
    private String engineType;
    private String driveTrain;


    public ManufacturedEngine() {
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date();
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineType = "85 AKI";
        this.engineCylinder = 0;
        this.driveTrain = "2WD: Two-Wheel Drive";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake, String engineModel, String driveTrain, String engineType, int engineCylinder) {
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineManufacturer = engineManufacturer;
        this.driveTrain = driveTrain;
        this.engineType = engineType;
        this.engineCylinder = engineCylinder;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
    }

    //setters
    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinder = engineCylinders;

    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }

    @Override
    public String toString() {
        return
                "Engine Manufacturer: " + engineManufacturer + "\n" +
                        " Engine Manufactured: " + engineManufacturedDate.toString() + "\n" +
                        " Engine Make: " + engineMake + "\n" +
                        " Engine Model: " + engineModel + "\n" +
                        " Engine Cylinder: " + engineCylinder + "\n" +
                        " Engine Type: " + engineType +  "\n" +
                        " Drive Train: " + driveTrain ;
    }
}
