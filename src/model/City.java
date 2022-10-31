/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author npatel
 */
public class City {
    private String cityName; 
    private String communityName;
    private int houseNo;
   // private ArrayList<Community> communities;

        
    public String getName() {
        return cityName;
    }

    public void setName(String cityName) {
        this.cityName = cityName;
    }

    public int getHouse() {
        return houseNo;
    }

    public void setHouse(int houseNo) {
        this.houseNo = houseNo;
    }
    public String getCommunity() {
        return communityName;
    }

    public void setCommunity(String communityName) {
        this.communityName = communityName;
    }
    @Override
    public String toString(){
        return cityName;
        
    }
   /* public City(){
        this.communities = new ArrayList<>();
    }
    public ArrayList<Community> getHistory(){
        return communities;
    }  
    public void setHistory(ArrayList<Community> communities){
        this.communities = communities;
    }
    public Community addNewCommunity(){
        Community newCommunity = new Community();
        communities.add(newCommunity);
        return newCommunity;
    }*/
}
