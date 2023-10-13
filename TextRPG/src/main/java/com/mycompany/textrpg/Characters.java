/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textrpg;

/**
 *
 * @author 2167784
 */
public abstract class Characters {
    
 // variable all characters have   
    public String name;
    public int maxHP, hp, xp;
    
 // Constructor for character
  public Characters( String name, int maxHP , int xp){
      this.name = name;
      this.maxHP = maxHP;
      this.hp = maxHP;
      this.xp = xp;
  }
  
 // methods all characters have
    public abstract int att();
    public abstract int def();
}
