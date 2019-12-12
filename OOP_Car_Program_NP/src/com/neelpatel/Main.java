package com.neelpatel;

import java.util.Date;

/**
 * @author Neel Patel
 * Car Program for OOP
 * Created this to get the basic ideas for:
 * - User interfaces,
 * - Immuatable Classes.
 * - Model business problems using Java classes
 * Stackoveflow was used for reference and Youtube.
 */
public class Main {

    //prints all the results from 1- 10 questions for Activity 2-1 Java Class Design - Interfaces
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
    ManufacturedEngine ManuEngine2 =
        new ManufacturedEngine(
            "Honda", new Date(), "H-Series", "H23A1", "2WD: Two-wheel Drive", "88 AKI", 4);
    System.out.println(ManuEngine2);

    System.out.println("-----------------------------------");

    InteriorFeature interiorFeature1 = new InteriorFeature();
    System.out.println(interiorFeature1);
    InteriorFeature interiorFeature2 = new InteriorFeature("Climate Control");
    System.out.println(interiorFeature2);

    System.out.println("-----------------------------------");

    ExteriorFeature exteriorFeature1 = new ExteriorFeature();
    System.out.println(exteriorFeature1);
    ExteriorFeature exteriorFeature2 = new ExteriorFeature("Fog Lamps");
    System.out.println(exteriorFeature2);

    System.out.println("-----------------------------------");

    Vehicle vehicle1 = new Vehicle();
    System.out.println(vehicle1);
    Vehicle vehicle2 =
        new Vehicle(
            new Date(),
            "Honda",
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Uni-body"),
            new ManufacturedEngine(
                "Honda", new Date(), "H Series", "H23A1", "2WD: Two-wheel Drive", "88 AKI", 4));
    System.out.println(vehicle2);

    System.out.println("-----------------------------------");

    Car car1 = new Car();
    System.out.println(car1);
    System.out.println("-----------------------------------");

    Feature[] f = {
      new InteriorFeature("AM/FM Radio"),
      new InteriorFeature("Air Conditioning"),
      new ExteriorFeature("Wood Panels"),
      new ExteriorFeature("Moonroof")
    };

    Car car2 =
        new Car(
            new Date(),
            "Honda",
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("uni-body"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", "2WD: Two-wheel Drive", "88 AKI", 4),
            f,
            2);
    System.out.println(car2);
    System.out.println("-----------------------------------");

    Vehicle vehicle =
        new Car(
            new Date(),
            "Honda",
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Uni-body"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", "2WD: Two-wheel Drive", "88 AKI", 4),
            f,
            2);
    System.out.println(vehicle);
    System.out.println("-----------------------------------");
    System.out.println("Exterior Features: " + car2.getExteriorFeatures());
    System.out.println("Interior Features: " + car2.getInteriorFeatures());

    System.out.println("-----------------------------------");
  }
}
