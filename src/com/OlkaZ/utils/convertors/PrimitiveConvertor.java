package com.OlkaZ.utils.convertors;


import java.awt.*;

public class PrimitiveConvertor {
    float float1 = 11.75f;
    int int1 = 7;
    char char1 = '7';

    public void floatToChar() {
        char1 = (char) float1 ;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
    }
    public void intToChar(){
        char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }
    public void charToInt(){
        int1 = (int) char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }
    public void floatToInt(){
        int1 = (int) float1;
        System.out.println("Input char value is " + float1 + ". Output int value is " + int1);
    }
}
