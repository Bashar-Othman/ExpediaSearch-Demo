/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bashar Othman
 */
public class OfferDateRange {

    private ArrayList<Date> travelStartDate;

    public ArrayList<Date> getTravelStartDate() {
        return this.travelStartDate;
    }

    public void setTravelStartDate(ArrayList<Date> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    private ArrayList<Date> travelEndDate;

    public ArrayList<Date> getTravelEndDate() {
        return this.travelEndDate;
    }

    public void setTravelEndDate(ArrayList<Date> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    private int lengthOfStay;

    public int getLengthOfStay() {
        return this.lengthOfStay;
    }

    public void setLengthOfStay(int lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    @Override
    public String toString() {
        return "OfferDateRange{" + "travelStartDate=" + travelStartDate + ", travelEndDate=" + travelEndDate + ", lengthOfStay=" + lengthOfStay + '}';
    }
    
    
}
