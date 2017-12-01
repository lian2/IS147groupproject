package com.company;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int a;
        System.out.println("Welcome to IS Fastfood!");
        String[] item = new String[5];
        double[] price = new double[5];

        item[0] = "1. Fried Chicken Wings: ";
        price[0] = 6.99;

        item[1] = "2. Philly Cheesesteak: ";
        price[1] = 5.99;

        item[2] = "3. Cheese Pizza: ";
        price[2] = 8.99;

        item[3] = "4. Chocolate Cookie: ";
        price[3] = 3.99;

        item[4] = "5. Pepsi: ";
        price[4] = 1.99;

        for (int i = 0; i < item.length; i++) {
            System.out.print(item[i] +
                    "$" + price[i] + "\n");
        }

        System.out.println("Please enter the number of the food you want: " +
                "\nPress '0' to checkout." +
                "\nPress 'q' to quit.");

    }
}
