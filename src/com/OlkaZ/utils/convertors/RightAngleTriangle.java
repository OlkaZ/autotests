package com.OlkaZ.utils.convertors;


import java.util.Scanner;

public class RightAngleTriangle {
    public static void calculateTriangle() {
        Scanner scannerA= new Scanner(System.in);
        System.out.println ("Please enter value of 'a' side ");
        double sideA = scannerA.nextDouble();

        Scanner scannerB= new Scanner(System.in);
        System.out.println ("Please enter value of 'b' side ");
        double sideB = scannerA.nextDouble();

        Scanner scannerC= new Scanner(System.in);
        System.out.println ("Please enter value of 'c' side ");
        double sideC = scannerA.nextDouble();

        if (sideC == Math.sqrt(sideA * sideA + sideB * sideB))
            { System.out.println ("It is right-angle triangle, c= " + sideC + " a= " + sideA + " b =" + sideB );}

            else { System.out.println("Triangle is not right-angle");}
    }
}
