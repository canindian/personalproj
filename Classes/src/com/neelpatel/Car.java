package com.neelpatel;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("s3xy")|| validModel.equals("911")){

        this.model = model;
    } else {
            this.model = "Unknown";
        }
// only two types of car are allowed or search for. more valid and correct.
        }

    public String getModel(){
        return this.model;
    }

// since they are private they can be only accessed in the car class.
// type 'this'

}
