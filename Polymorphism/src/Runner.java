
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2167784
 */
public class Runner {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    animal[] a = new animal[5];
    
    for ( int i=0; i < a.length; i++){
        System.out.println("What type of animal would you like to add?");
        System.out.println("0 for Dog. 1 for cat 2 for fish");
        
        
        int choice = Integer.parseInt(input.nextLine());
        
        switch (choice){
            case 0:
            a[i] = new dog();
            break;
            
            case 1:
            a[i] = new cat();
            break;
            
            default:
            a[i] = new fish();
            break;
        }
    }
        // Iterate through array and print type of animal it i
    for(int i =0; i<a.length;i++){
          if (a[i] instanceof dog){
              System.out.println("There is a dog at slot " + i);}
          else if(a[i] instanceof cat) {
              System.out.println("There is a cat at slot" +i);
          }
          else{
              System.out.println("There is a fish at slot " + i);}
      }
    
    }
}
