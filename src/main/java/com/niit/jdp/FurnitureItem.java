/*
 * Author Name : M.Krishna.
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class FurnitureItem {
    double furnitureCode;
    String furnitureType;
    String furnitureGrade;
    String furnitureColour;
    String furnitureUsage;
    double furniturePrice;


    public furnitureItem(double furniturePrice, double furnitureCode, String furnitureColour, String furnitureGrade, String furnitureType, String furnitureUsage) {
        this.furniturePrice = furniturePrice;
        System.out.println(this.furniturePrice);
        this.furnitureCode = furnitureCode;
        this.furnitureColour = furnitureColour;
        this.furnitureGrade = furnitureGrade;
        this.furnitureType = furnitureType;
        this.furnitureUsage = furnitureUsage;
    }



