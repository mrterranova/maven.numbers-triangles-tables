package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for(int i=1; i<= 5; i++){
            for(int j=1; j<= 5; j++){
                if (i*j < 10){
                    table += "  " + i*j + " |";
                } else{
                    table += " " +i*j + " |";
                }
            }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        for(int i=1; i<= 10; i++){
            for(int j=1; j<= 10; j++){
                if (i*j < 10){
                    table += "  " + i*j + " |";
                } else if (i*j <100){
                    table += " " +i*j + " |";
                } else {
                    table += i*j + " |";
                }
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for(int i=1; i<= tableSize; i++){
            for(int j=1; j<= tableSize; j++){
                if (i*j < 10){
                    table += "  " + i*j + " |";
                } else if (i*j <100){
                    table += " " +i*j + " |";
                } else {
                    table += i*j + " |";
                }
            }
            table += "\n";
        }
        return table;
    }
}
