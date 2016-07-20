package com.OlkaZ.utils.convertors;


import java.util.Scanner;

public class BiggestNumberCheker {
    public static void calculateBiggerNumber(){
        Scanner scannerInput1 = new Scanner(System.in);
        System.out.println("Please enter value 1");
        double value1 = scannerInput1.nextDouble();

        Scanner scannerInput2 = new Scanner(System.in);
        System.out.println("Please enter value 1");
        double value2 = scannerInput2.nextDouble();

        if (value1 > value2){ System.out.println("Value 1 is bigger then value 2"); }
        else {if ( value1 < value2) {System.out.println("Value 1 is smaller then value 2");}
            else {System.out.println("Values are equal");}
        }

    }
}
