package com.neelpatel;

public class Main {

    public static void main(String[] args) {
        Car tesla = new Car();
        Car porsche = new Car();
// when using a class...always initialize your new objects.
        System.out.println("Model is "+ tesla.getModel());
// before we set it the it will print null.
        tesla.setModel("S3XY");
        System.out.println("Model is "+ tesla.getModel());
    }
}
