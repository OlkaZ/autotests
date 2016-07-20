package com.OlkaZ.utils.convertors;

import java.util.Scanner;

public class CircleArea {
    public static final double Pi = 3.14d;
    public static void calculateBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius for first circle ");
        double radius1 = scanner.nextDouble();
        double circleArea = Pi * radius1 * radius1;
        double area1 = circleArea;
        System.out.println("Please enter radius for second circle ");
        double radius2 = scanner.nextDouble();
        circleArea = Pi * radius2 * radius2;
        double area2 = circleArea;


        if ((radius1 > radius2) || (area1 > area2))
        {
            System.out.print("Area1 is bigger, ");
            System.out.print("Area2 is smaller ");}
        else
             {
                System.out.print("Area2 is bigger, ");
                System.out.print("Area1 is smaller ");}
        }
    }