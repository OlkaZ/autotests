package com.OlkaZ.runners;

import com.OlkaZ.utils.convertors.PrimitiveConvertor;

public class Executor {
    public static void main (String args[]) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar();
        primitiveConvertor.intToChar();
        primitiveConvertor.charToInt();
    }
}
