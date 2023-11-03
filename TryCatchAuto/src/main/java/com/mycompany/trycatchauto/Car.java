/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trycatchauto;

/**
 *
 * @author 2167784
 */
public class Car extends Automobile {
    private boolean spoiler;
    private boolean sunroof;
    private int numDoors;

    /**
     * @return the spoiler
     */
    public boolean isSpoiler() {
        return spoiler;
    }

    /**
     * @param spoiler the spoiler to set
     */
    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    /**
     * @return the sunroof
     */
    public boolean isSunroof() {
        return sunroof;
    }

    /**
     * @param sunroof the sunroof to set
     */
    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    /**
     * @return the numDoors
     */
    public int getNumDoors() {
        return numDoors;
    }

    /**
     * @param numDoors the numDoors to set
     */
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    
    @Override
    
    public String toString(){
    String rtr = super.toString();
        if(spoiler ==true){
           rtr += "Has Spoiler: Yes \n";
        }
        else{
            rtr += "Has Spoiler: No \n";
        }
        if(sunroof ==true){
           rtr += "Has Sunroof: Yes \n";
        }
        else{
            rtr += "Has Sunroof: No \n";
        }
        
        rtr += "Number of Doors: " +numDoors +"\n";
        return rtr;
    
    }
}
