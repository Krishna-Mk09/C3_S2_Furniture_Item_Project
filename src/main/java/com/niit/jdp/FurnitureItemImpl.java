/*
 * Author Name : M.Krishna.
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem(500.0, 12345, "red", "grade1", "indoor", "forMe");

        System.out.println(furnitureItem.calculateDiscountBasedOnUsage());

    }
}
