/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trycatchauto;

import java.util.Scanner;

/**
 *
 * @author 2167784
 */
public class Runner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Automobile[] k = new Automobile[2];
        Car c = new Car();
        Truck t = new Truck();

        for (int i = 0; i < k.length; i++) {
            System.out.println("What vehicle would you like to add?");
            System.out.println("0 for Car. 1 for Truck");
            int error=1;
            try{
            int choice = Integer.parseInt(input.nextLine());
            
            switch (choice) {
                
                case 0:
                  while( error ==1){
                      error =0;
                  try{
                    k[i] = new Car();

                    System.out.println("Enter the make of Car");
                    c.setMake(input.nextLine());

                    System.out.println("Enter the model");
                    c.setModel(input.nextLine());

                    System.out.println("Enter it's features");
                    c.setFeatures(input.nextLine());

                    System.out.println("What's the price?");
                    c.setPrice(Double.parseDouble(input.nextLine()));

                    System.out.println("What's the dealership markup?");
                    c.setDealerMarkup(Double.parseDouble(input.nextLine()));
                    System.out.println("those bastards....");

                    System.out.println("How many doors?");
                    c.setNumDoors(Integer.parseInt(input.nextLine()));

                    System.out.println("Does it have a spoiler?");
                    char answer = input.nextLine().toLowerCase().charAt(0);
                    if (answer == 'y') {
                        c.setSpoiler(true);
                    } else {
                        c.setSpoiler(false);
                    }

                    System.out.println("Does it have a sunroof?");
                    char answer2 = input.nextLine().toLowerCase().charAt(0);
                    if (answer2 == 'y') {
                        c.setSunroof(true);
                    } else {
                        c.setSunroof(false);
                    }
                    break;
                  }catch(NumberFormatException ex){
                      System.out.println("Invalid input");
                       error=1;}
                  }
                case 1:
                    while (error==1){
                        error=0;
                    try{
                    
                    k[i] = new Truck();
                    System.out.println("Enter the make of Truck");
                    t.setMake(input.nextLine());

                    System.out.println("Enter the model");
                    t.setModel(input.nextLine());

                    System.out.println("Enter it's features");
                    t.setFeatures(input.nextLine());

                    System.out.println("What's the price?");
                    t.setPrice(Double.parseDouble(input.nextLine()));

                    System.out.println("What's the dealership markup?");
                    t.setDealerMarkup(Double.parseDouble(input.nextLine()));
                    System.out.println("those bastards....");

                    System.out.println("What is the bed length?");
                    t.setBedLength(Double.parseDouble(input.nextLine()));

                    System.out.println("Does it have a Super Cab?");
                    char answer3 = input.nextLine().toLowerCase().charAt(0);
                    if (answer3 == 'y') {
                        t.setSuperCab(true);
                    } else {
                        t.setSuperCab(false);
                    }

                    System.out.println("Does it have a Quad Cab?");
                    char answer4 = input.nextLine().toLowerCase().charAt(0);
                    if (answer4 == 'y') {
                        t.setQuadCab(true);
                    } else {
                        t.setQuadCab(false);
                    }
                    break;
                    }catch(NumberFormatException ex){
                        System.out.println("Invalid input");
                        error = 1;
                    }
                    }
                default: 
                    System.out.println("Invalid input. Please enter 0 or 1. ");
                    i--;
                    break;
                  
                }
            
            }catch(NumberFormatException ex){
                    System.out.println("Invalid input please enter 0 or 1");
                    i--;
            }
        }
        System.out.println("The ShawU Auto Emporium contains the following Automobiles:");

        for (int i = 0; i < k.length; i++) {
            if (k[i] instanceof Car) {
                System.out.println("Car");
                System.out.println(c.toString());
            } else {
                System.out.println("Truck");
                System.out.println(t.toString());
            }
        }

    }
}
