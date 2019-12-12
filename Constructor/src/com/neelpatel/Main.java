package com.neelpatel;

public class Main {

    public static void main(String[] args) {


        Account neelsAccount = new Account();
        neelsAccount.setNumber("13");
        neelsAccount.setCustomerPhoneNumber("239-322-7163");
        neelsAccount.setBalance(0);
        neelsAccount.setCustomerName("Neel Patel");
        neelsAccount.setCustomerEmailAddress("neelpatel13@gmail.com");



        neelsAccount.withdrawal(100);

        neelsAccount.deposit(50);
        neelsAccount.withdrawal(100);

        neelsAccount.deposit(51);
        neelsAccount.withdrawal(100);
    }
}
