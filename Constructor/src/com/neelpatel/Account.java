package com.neelpatel;

public class Account {
    private String number;
    private double balance;
    private String customerEmailAddress;
    private String customerName;
    private String customerPhoneNumber;

    public Account(){
        System.out.println("Empty constructor called ");
    }
    //constructor only the access modifier and the name of the class and also the number of parameter

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of $"+ depositAmount+ " made. New balance is $" +this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only $"+ this.balance +" available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processes. Remaining balance = $"+ this.balance );
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
