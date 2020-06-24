package com.company;

import java.text.NumberFormat;

public class PrintFormat {

    private  Calculations calculator;

    public PrintFormat(Calculations calculator) {
        this.calculator = calculator;
    }

    public void paymentSchedule(){
        double mortgage = calculator.calculateMortgage();
        System.out.println();
        System.out.println("MORTGAGE:");
        System.out.println("__________");
        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));

        System.out.println();
        System.out.println("MORTGAGE BALANCE:");
        System.out.println("______________");
        for (byte month = 1; month<=calculator.getYears()* Main.months_in_year; month++){
            double balance= calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
