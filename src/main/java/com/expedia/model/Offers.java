/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.model;

import com.fasterxml.jackson.annotation.JsonView;
import java.util.ArrayList;

/**
 *
 * @author Bashar Othman
 */
public class Offers {

    @JsonView
    private ArrayList<Hotel> Hotel;

    public ArrayList<Hotel> getHotel() {
        return this.Hotel;
    }

    public void setHotel(ArrayList<Hotel> Hotel) {
        this.Hotel = Hotel;
    }

    @Override
    public String toString() {
        return "Offers{" + "Hotel=" + Hotel + '}';
    }
    
    
}
