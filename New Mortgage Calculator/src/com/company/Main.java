package com.company;


public class Main {
    final static int months_in_year=12;
    final static int percent=100;


    public static void main(String[] args) {
        int principal=(int) Console.readNumber("principal:",1_000,10_000);
        double annual_interest= Console.readNumber("annual_interest:",1,30);
        byte years = (byte) Console.readNumber("years:",1,30);

        var calculator= new Calculations(principal,annual_interest,years);

        var report= new PrintFormat(calculator);
        report.paymentSchedule();



    }

}
