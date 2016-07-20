package com.OlkaZ.utils.convertors;


import java.util.Scanner;

public class EvenOrOddCheker {

    public static void calculateEvenOrOdd()    {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Please enter value which should be calculate whether it is even or odd");
        int inputValue = scannerInput.nextInt();

        if (inputValue % 2 == 0) {
            System.out.print( "You type " + inputValue + " and it is even" );
        }
        else {System.out.print( "You type " + inputValue + " and it is odd" );}
    }


}
