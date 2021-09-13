package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Weight(lbs)" );
        double weight = input.nextInt();

        System.out.println("Enter Height(in) " );
        double height = input.nextInt();

        double bmi;
        bmi = weight / (height*height) * 703;
        System.out.printf("Your BMI is %.1f\n", bmi);

        if (18.5 < bmi && 25 > bmi)
            System.out.println("You are within the ideal weight range.");
        else if (bmi < 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else if (bmi > 25)
            System.out.println("You are overweight. You should see your doctor.");



    }
}
