/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex31;
import java.util.Scanner;

public class KarvonenHeartRate {

    public static void main(String[] args) {

        int heartRate, age;

        Scanner heart = new Scanner(System.in);
        System.out.print("Enter your resting heart rate: ");
        heartRate = heart.nextInt();

        Scanner userAge = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = userAge.nextInt();

        System.out.println("");
        System.out.print("Resting pulse: " + heartRate + "      Age: " + age);
        System.out.println("\n");

        System.out.print("Intensity   | Rate\n");
        System.out.println("------------------------");

        for(int intensity = 55; intensity <= 95; intensity += 5) {

            int targetHeartRate = (((220 - age) - heartRate) * intensity/100) + heartRate;

            System.out.println(intensity + "%         | " + targetHeartRate);

        }

    }


}
