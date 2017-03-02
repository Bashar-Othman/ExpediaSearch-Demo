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
public class HotelUrls {

    private String hotelInfositeUrl;

    public String getHotelInfositeUrl() {
        return this.hotelInfositeUrl;
    }

    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    private String hotelSearchResultUrl;

    public String getHotelSearchResultUrl() {
        return this.hotelSearchResultUrl;
    }

    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    @Override
    public String toString() {
        return "HotelUrls{" + "hotelInfositeUrl=" + hotelInfositeUrl + ", hotelSearchResultUrl=" + hotelSearchResultUrl + '}';
    }
    
}
