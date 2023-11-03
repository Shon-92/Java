/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trycatchauto;

/**
 *
 * @author 2167784
 */
public class Truck extends Automobile{

    /**
     * @return the bedLength
     */
    public double getBedLength() {
        return bedLength;
    }

    /**
     * @param bedLength the bedLength to set
     */
    public void setBedLength(double bedLength) {
        this.bedLength = bedLength;
    }

    /**
     * @return the quadCab
     */
    public boolean isQuadCab() {
        return quadCab;
    }

    /**
     * @param quadCab the quadCab to set
     */
    public void setQuadCab(boolean quadCab) {
        this.quadCab = quadCab;
    }

    /**
     * @return the superCab
     */
    public boolean isSuperCab() {
        return superCab;
    }

    /**
     * @param superCab the superCab to set
     */
    public void setSuperCab(boolean superCab) {
        this.superCab = superCab;
    }
    private double bedLength;
    private boolean quadCab;
    private boolean superCab;
    
    @Override
    
    public String toString(){
    String rtr = super.toString();
        if(quadCab ==true){
           rtr += "Has Quad Cab: Yes \n";
        }
        else{
            rtr += "Has Quad Cab: No \n";
        }
        if(superCab ==true){
           rtr += "Has Super Cab: Yes \n";
        }
        else{
            rtr += "Has Super Cab: No \n";
        }
        
        rtr+= "Bed Length: " +bedLength + "\n";
        
        return rtr;
    
    }
}
