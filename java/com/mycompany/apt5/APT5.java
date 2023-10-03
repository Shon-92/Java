/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apt5;
import java.util.Scanner;
/**
 *
 * @author 2167784
 */
public class APT5 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        System.out.println("Hello, please enter as many names you can think of.");
        System.out.println("Type 'Stop' when you're done.");
        
        
        
        int numofnames = 0;
        
        while(true){
        String name = input.nextLine();
        if (name.equalsIgnoreCase("Stop")){
            break;
        }
        
        else {
        numofnames++;
        }
      
        
        
    }
        System.out.println("You entered " +numofnames+ " total names.");
  }

    }
}
