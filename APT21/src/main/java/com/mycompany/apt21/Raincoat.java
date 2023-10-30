/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apt21;

/**
 *
 * @author 2167784
 */
public class Raincoat extends Jacket {
    private boolean pullover;
    private boolean pockets;
    
    @Override
    public boolean isRequired(int randNumber){
        return randNumber > 50;
    }

    /**
     * @return the pullover
     */
    public boolean isPullover() {
        return pullover;
    }

    /**
     * @param pullover the pullover to set
     */
    public void setPullover(boolean pullover) {
        this.pullover = pullover;
    }
    public boolean getPullover(){
        return pullover;
    }

    /**
     * @return the pockets
     */
    public boolean isPockets() {
        return pockets;
    }

    /**
     * @param pockets the pockets to set
     */
    public void setPockets(boolean pockets) {
        this.pockets = pockets;
    }
    public boolean getPockets(){
        return pockets;
    }
    @Override
    public String toString(){
     String rtrString = super.toString();
    if( pullover == true){
    rtrString += "It's a pullover \n";
    }
    else{
    rtrString += "It's not a pullover \n";
    }    
    if( pockets == true){
    rtrString += "It has pockets \n";
    }
    else{
    rtrString += "It has no pockets \n";
    }    
    return rtrString;
    }
}
