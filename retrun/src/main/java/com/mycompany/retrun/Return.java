/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retrun;

/**
 *
 * @author 2167784
 */
public class Return {
    public static void main (String[] args){
    printmessage();
    // calling method with two parameters
    // doesnt print anything because there is no sout within the add method
    add(5, 4);
    // caling same method and assigning result to a variable
    int sum = add(5,4);
    // print the variable which is the result of the add method
    System.out.println(sum);
    
    // make call a string type method and save it to shouting
    String shouting = caps("why are we yelling!?");
    System.out.println(shouting);
    
    // create int array called awesomeArray
    //set it equal to gimmeArray METHOD with given values
    int[] awesomeArray = gimmeArray(5,8,9);
    
    // print out each index of awesomeArray
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);
    }
    
    // creating a method to print message
    // void means return nothing
    public static void printmessage(){
        System.out.println("hello");
    }
    
    // creating adding method
    // int here means to return an int type 
    // to return is to run a method and be able to assign the result to a variable
    public static int add(int a, int b){
        return a + b;
    }
    // method to create all caps
    public static String caps(String s){
    return s.toUpperCase();
    }
    
    // method to return ints into an array of ints
    // assign variable to each individual index then return 
    public static int[] gimmeArray(int a , int b, int c){
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }
}
