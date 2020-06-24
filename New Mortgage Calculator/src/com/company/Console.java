package com.company;

import java.util.Scanner;

public class Console {
    public static double readNumber(String prompt, double min, double max){
        double value =0;
        while (true) {
            Scanner scanner=new Scanner(System.in);
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value>= min && value <= max)
                break;
            System.out.println("input values between"+min+ "and" +max);
        }
           return value;
        }
}
