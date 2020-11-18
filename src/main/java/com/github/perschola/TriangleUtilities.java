package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String star = "";
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j<= i; j++) {
                star += "*";
            }
            star += "\n";
        }
        return star;


    }

    public static String getRow(int numberOfStars) {
//        String stars = "";
//        for(int i =0; i < numberOfStars; i++){
//            stars += "*";
//        }
//        return stars;
        return new String(new char[numberOfStars]).replace("\u0000", "*");
    }

    public static String getSmallTriangle() {
        String star = "";
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j<= i; j++) {
                star += "*";
            }
            star += "\n";
        }
        return star;
    }

    public static String getLargeTriangle() {
        String star = "";
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j<= i; j++) {
                star += "*";
            }
            star += "\n";
        }
        return star;
    }
}
