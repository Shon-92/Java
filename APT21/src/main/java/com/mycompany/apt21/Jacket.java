/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apt21;

/**
 *
 * @author 2167784
 */
public abstract class Jacket {
    private String brand;
    private String model;
    private int cost;
    private String rate;
    
    
    public abstract boolean isRequired(int randNumber);
    
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the rate
     */
    public String getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(String rate) {
        this.rate = rate;
    }
    
    
    public String toString(){
    String rtrString = "Brand :" + brand +"\n";
           rtrString += "Model :" + model +"\n";
           rtrString += "Price :" + cost +"\n";
           rtrString += "Rating :" + rate +"\n";
    return rtrString;
    }
}
