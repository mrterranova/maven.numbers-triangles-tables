package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String numString = "";
        for(int i = start; i < stop; i++){
            if(i%2==0){
                numString += i;
            }
        }
        return numString;
    }


    public static String getOddNumbers(int start, int stop) {
        String numString = "";
        for(int i = start; i < stop; i++){
            if(i%2 == 1){
                numString += i;
            }
        }
        return numString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String numString = "";
        for(int i = start; i < stop; i+=step){
            numString += (int)Math.pow(i, 2);
        }
        return numString;
    }

    public static String getRange(int start) {
        String numString="";
        for(int i=0; i < start; i++){
            numString += i;
        }
        return numString;
    }

    public static String getRange(int start, int stop) {
        String numString = "";
        for(int i=start; i < stop; i++){
            numString += i;
        }
        return numString;
    }


    public static String getRange(int start, int stop, int step) {
        String numString = "";
        for(int i=start; i < stop; i+=step){
            numString += i;
        }
        return numString;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String numString = "";
        for (int i=start; i < stop; i+=step){
            numString += (int)Math.pow(i, exponent)+"";
        }
        return numString;
    }
}
