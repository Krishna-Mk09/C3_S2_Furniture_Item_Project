/*
 * Author Name : M.Krishna.
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    String furnitureGrade;
    String furnitureColour;
    String furnitureUsage;
    double furniturePrice;


    public FurnitureItem(double furniturePrice, int furnitureCode, String furnitureColour, String furnitureGrade, String furnitureType, String furnitureUsage) {
        this.furniturePrice = furniturePrice;
        this.furnitureCode = furnitureCode;
        this.furnitureColour = furnitureColour;
        this.furnitureGrade = furnitureGrade;
        this.furnitureType = furnitureType;
        this.furnitureUsage = furnitureUsage;
    }

    public void displayResult() {
        System.out.println(this.furniturePrice);

    }

    public double calculateDiscountBasedOnUsage() {
        return this.furniturePrice - this.furniturePrice * 5 / 100;
    }

    enum type {
        CHAIRS, CUPBOARDS, STOOLS, TABLES
    }

    enum colour {
        RED, BLUE, GREEN
    }

    public FurnitureItem() {
    }

    enum usage {
        INDOOR, OUTDOOR
    }

    enum grade {
        GRADE1, GRADE2, GRADE3
    }

}


