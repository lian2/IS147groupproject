package com.company;

import java.util.Scanner;

public class OrderDetail {

    private String name, phoneNumber;
    private int order;
    private boolean type;

    public OrderDetail() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter full name");
        this.name = in.nextLine();

        System.out.println("please enter phone number");
        this.phoneNumber = in.nextLine();

        System.out.println("Do you want delivery?(y or n)");
        this.type = in.nextLine().toLowerCase().equals("y");///Type: Pick up OR Delivery

    }

    //setters&getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    public int getOrder() {
        return order;
    }

    public void setType(boolean type) {
        this.type = type;
    }
    public boolean getType() {
        return type;
    }
    public void printMe(){
        totalCost();
        System.out.println("Name: "+this.name + "\nPhone#: "+this.phoneNumber+ "\nDelivery? "+this.type+"\nTotal order: $"+this.totalCost);

    }
    //declaring variables for methods of cost and total cost of pizza

    double totalCost,price,deliveryCost;

    //method for determining menu
    public double MneuPrice(){
        if (getOrder() == 1 ){
            price = 6.99;
        }//end if for order Fried chicken wings
        else if (getOrder() ==2){
            price = 5.99;
        }//end else-if for order Philly Cheesteak

        else if (getOrder()==3){
            price = 8.99;
        }
        //end else-if for order Cheese Pizza
        else if (getOrder()==4){
            price = 3.99;
        }//end else-if for order Chocolate cookie
        else if (getOrder()==(5)){
            price = 1.99;
        }//end else-if for order Pepsi
        else {
            System.out.println("Error: Enter the correct order");
        }//end else
        return price;
    }


    public double totalCost(){
        if (getType()){
            deliveryCost = 10;
        }//end if delivery
        else if (getType()){
            deliveryCost = 0;
        }//end else-if delivery
        price = MneuPrice();
        return totalCost = price + deliveryCost;
    }
}
