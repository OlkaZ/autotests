package com.OlkaZ.runners;

import com.OlkaZ.utils.convertors.BiggestNumberCheker;
import com.OlkaZ.utils.convertors.CircleArea;
import com.OlkaZ.utils.convertors.RightAngleTriangle;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 if you want to calculate triangle");
        System.out.println("Please enter 2 if you want to calculate circle area");
        System.out.println("Please enter 3 if you want to know what number of two is bigger");
        int button = scanner.nextInt();

        if (button == 1) {
            CircleArea.calculateBigger();
        }
        else {
            if (button == 2){
                RightAngleTriangle.calculateTriangle();}
            else {
                if (button == 3){ BiggestNumberCheker.calculateBiggerNumber();}
                else {System.out.println("Please choose between 1, 2 and 3");}
            }
        }
    }
}
