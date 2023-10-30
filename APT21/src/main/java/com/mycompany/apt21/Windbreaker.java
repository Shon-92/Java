/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apt21;

/**
 *
 * @author 2167784
 */
public class Windbreaker extends Jacket{
   private boolean quality;
   private String nickname;
   
   @Override
   public boolean isRequired(int randNumber){
       return randNumber > 30;
   }

    /**
     * @return the quality
     */
    public boolean isQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(boolean quality) {
        this.quality = quality;
    }
    
    public boolean getQuality(){
        return quality;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
    @Override
    public String toString(){
     String rtrString = super.toString();
    if( quality == true){
    rtrString += "It's has quality \n";
    }
    else{
    rtrString += "It's not quality \n";
    }    
    rtrString += "Nickname: " +nickname; 
    return rtrString;
    }
}
