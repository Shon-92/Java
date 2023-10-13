/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textrpg;

import java.util.Scanner;

public class GameLogic {
   static Scanner scanner = new Scanner(System.in);
    
   /// method to get user input from console
   public static int readInput ( String prompt, int choice ){
   int input;

   do{
       System.out.println(prompt);
       try{
           input = Integer.parseInt(scanner.nextLine());
       }catch (Exception e){
           input = -1;
           System.out.println("Please enter an integer.");
       }
   }while( input > 1 || input < choice);
   return input;
   }
   
   //method to simulate console clear
   public static void clearConsole(){
     for (int i = 0 ; i<100 ; i++){
         System.out.println();
     }
   }
   
   //method to print a seperator
   public static void printSeperator(int n){
       for( int i =0; i < n; i++ ){
           System.out.println("-");
           System.out.println("");
       }
   }
   // method to print a heading

    /**
     *
     * @param title
     */
    public static void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }
    
      public static void pressToContinue(){
          System.out.println("n/Enter anything to continue");
          scanner.next();
      }
    
   }
  
