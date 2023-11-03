/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trycatchauto;

/**
 *
 * @author 2167784
 */
public class ParkingSpot {

    /**
     * @return the automobile
     */
    public Automobile getAutomobile() {
        return automobile;
    }

    /**
     * @param automobile the automobile to set
     */
    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    private Automobile automobile;
    private boolean filled;
}
