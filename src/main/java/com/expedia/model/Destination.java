/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.model;

/**
 *
 * @author Bashar Othman
 */
public class Destination {

    private String regionID;

    public String getRegionID() {
        return this.regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    private String longName;

    public String getLongName() {
        return this.longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    private String country;

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String province;

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    private String city;

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Destination{" + "regionID=" + regionID + ", longName=" + longName + ", country=" + country + ", province=" + province + ", city=" + city + '}';
    }
    
    
}
