package com.company;

public class Calculations {
    private int principal;
    private double annual_interest;
    private byte years;

    private double monthly_interest = annual_interest / Main.percent / Main.months_in_year;
    private double number_of_payment = years * Main.months_in_year;

    public Calculations(int principal, double annual_interest, byte years) {
        this.principal = principal;
        this.annual_interest = annual_interest;
        this.years = years;
    }

    public double calculateMortgage(){
        double mortgage= principal*(monthly_interest*Math.pow(1+monthly_interest,number_of_payment)/(Math.pow(1+monthly_interest,number_of_payment)-1));
        return mortgage;
    }

    public double calculateBalance(short numberOfPaymentMade){
        double balance=principal*(Math.pow(1+monthly_interest,number_of_payment)-Math.pow(1+monthly_interest,numberOfPaymentMade))/(Math.pow(1+monthly_interest,number_of_payment)-1);
        return balance;
    }

    public byte getYears() {
        return years;
    }
}
