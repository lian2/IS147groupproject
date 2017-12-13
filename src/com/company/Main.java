package com.company;

import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        //menu
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
        //select food
        int a;
        System.out.println("Please enter the number of the food you want: " +
             "\nPress '0' to quit.");

        Scanner select = new Scanner(System.in);
        a = select.nextInt();
        if(a!=0) switch (a) {
            case 1:
                System.out.println("You have selected Fried Chicken Wings.");
                OrderDetail o = new OrderDetail();
                break;
            case 2:
                System.out.println("You have selected Philly Cheesesteak. ");
                OrderDetail r = new OrderDetail();
                break;
            case 3:
                System.out.println("You have selected Cheese Pizza.");
                OrderDetail d = new OrderDetail();
                break;
            case 4:
                System.out.println("You have selected Chocolate Cookie.");
                OrderDetail e = new OrderDetail();
                break;
            case 5:
                System.out.println("You have selceted Pepsi.");
                OrderDetail i = new OrderDetail();
                break;
        }
    }
}
