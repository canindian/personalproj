package com.neelpatel;

public class Main {

    public static void main(String[] args) {
        String month = "FebRUary";
        switch (month.toLowerCase()) {
            case "january" :
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march" :
                System.out.println("Mar");
                break;
            case "april" :
                System.out.println("Apr");
                break;
            default:
                System.out.println("Not a month between January and April.");
                break;
        }
    }
}
