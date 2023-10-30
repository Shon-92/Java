/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apt21;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 2167784
 */
public class Runner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Windbreaker wind = new Windbreaker();
        Raincoat rain = new Raincoat();

        int winds = rand.nextInt(101);
        System.out.println("Welcome. Let's check the weather for you...");
        System.out.println("It looks like the current windspeed is " + winds + " mph.");
        if (wind.isRequired(winds)) {
            System.out.println("You will need a windbreaker.");
        } 
        else {
            System.out.println("You won't need a windbreaker.");
        }

        int chance = rand.nextInt(101);
        System.out.println("It looks like there is a " + chance + "% of rain.");
        if (rain.isRequired(chance)) {
            System.out.println("You will need a raincoat.");
        } 
        else {
            System.out.println("You won't need a raincoat.");
        }
        if (chance > 50) {
            System.out.println("What brand is your raincoat:");
            rain.setBrand(input.nextLine());
            

            System.out.println("What model is your raincoat:");
            rain.setModel(input.nextLine());
           

            System.out.println("How much did your raincoat cost:");
            rain.setCost(Integer.parseInt(input.nextLine()));
           

            System.out.println("What is your raincoat rated for (amount of water)?:");
            rain.setRate(input.nextLine());
            

            System.out.println("Is your raincoat a pullover (y/n)");
            char answer = input.nextLine().toLowerCase().charAt(0);
            if (answer == 'y') {
                rain.setPullover(true);
            } else {
                rain.setPullover(false);
            }
            

            System.out.println("Does your raincoat have pockets (y/n)");
            char answer2 = input.nextLine().toLowerCase().charAt(0);
            if (answer2 == 'y') {
                rain.setPockets(true);
            } else {
                rain.setPockets(false);
            }
            
        }

        if (winds > 30) {
            System.out.println("What brand is your windbreaker:");
            wind.setBrand(input.nextLine());
            

            System.out.println("What model is your windbreaker:");
            wind.setModel(input.nextLine());
           

            System.out.println("How much did your windbreaker cost:");
            wind.setCost(Integer.parseInt(input.nextLine()));
            

            System.out.println("What is your windbreaker rated for (wind speed)?:");
            wind.setRate(input.nextLine());
            

            System.out.println("Is your windbreaker high quality (y/n)");
            char answer3 = input.nextLine().toLowerCase().charAt(0);
            if (answer3 == 'y') {
                wind.setQuality(true);
            } else {
                wind.setQuality(false);
            }
            

            System.out.println("Do you have a nickname for your windbreaker, if so, what is it?");
            wind.setNickname(input.nextLine());
            
        }
        
        System.out.println("Lets check your wardrobe for the day");
        if(chance > 50){
            System.out.println(rain.toString());
        }
        if(winds > 30){
            System.out.println(wind.toString());
        }
        else{
            System.out.println("You can wear whatever you want !");
        }
       
    }
}
