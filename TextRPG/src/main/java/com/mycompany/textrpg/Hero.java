/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textrpg;

/**
 *
 * @author 2167784
 */
public class Hero extends Characters{
    // youtube java text rpg 3 min.
    // Array to hold skill names
    public String[] attUpgrade = {"Strength","Power","Might","Soul Breaker"};
    public String[] defUpgrade = {"Big Boned","Stoneskin", "Scale Armor", "Holy Aura"};
    
    // player specific constructor 
    public Hero(String name){
        // calling super constructor
        super(name, 100,0);
    }
    
    // player specific method for att
    public int att(){
    return 0;
    }
    
    public int def(){
    return 0;
    }
    
}
