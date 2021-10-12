package com.softwareinstitute.training.ellison.adam;

import java.util.Scanner;

public class Paint {

    public static void main(String[] args) {
	    Double width, height, coverage, price, quantity, cost;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter wall width in metres");

        width = input.nextDouble();

        System.out.println("Please enter the wall height metres");

        height = input.nextDouble();

        System.out.println("Please enter the coverage per tin in metres squared");

        coverage = input.nextDouble();

        System.out.println("Please enter price per tin of paint");

        price = input.nextDouble();

        //calculate cost of paint and quantity

        
        quantity = Math.ceil((width*height)/coverage);        
        cost = quantity * price;
        
        System.out.println("The quantity of Paint required will be " + quantity + ".");
        System.out.printf("The cost of the paint required will be £%.2f %n",cost);
    }
}