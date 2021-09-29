/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campsiterentalsapp;

/**
 *
 * @author x19126468
 */
public class Bookings {
    //Variables
    public String name;
    public String electricity;
    public String bookingType;
    public int pitchNum;
    public int stayNum;
    public int adultsNum;
    public int childrenNum;
    
    public Bookings(){
        name = new String();
        bookingType = new String();
        electricity = new String();
        pitchNum = 0;
        stayNum  = 0;
        adultsNum = 0;
        childrenNum = 0;
    }
    
    //Setters
    public void setName(String newname){
        name = newname;
    }
    
    public void setElectricity(String newElectricity){
        electricity = newElectricity;
    }
    
    public void setBookingType(String newBookingType){
        bookingType = newBookingType;
    }
    
    public void setPitchNum(int newPitchNum){
        pitchNum = newPitchNum;
    }
    
    public void setStayNum(int newStayNum){
        stayNum = newStayNum;
    }
    
    public void setAdultsNum(int newAdultsNum){
        adultsNum = newAdultsNum;
    }
    
    public void setChildrenNum(int newChildrenNum){
        childrenNum = newChildrenNum;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
    public String getElectricity(){
        return electricity;
    }
    
    public String getBookingType(){
        return bookingType;
    }
    
    public int getPitchNum(){
        return pitchNum;
    }
    
    public int getStayNume(){
        return stayNum;
    }
    
    public int getAdultsNum(){
        return adultsNum;
    }
    
    public int getChildrenNum(){
        return childrenNum;
    }
    
}