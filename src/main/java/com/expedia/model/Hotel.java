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
public class Hotel {

    private OfferDateRange offerDateRange;

    public OfferDateRange getOfferDateRange() {
        return this.offerDateRange;
    }

    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    private Destination destination;

    public Destination getDestination() {
        return this.destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    private HotelInfo hotelInfo;

    public HotelInfo getHotelInfo() {
        return this.hotelInfo;
    }

    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    private HotelUrgencyInfo hotelUrgencyInfo;

    public HotelUrgencyInfo getHotelUrgencyInfo() {
        return this.hotelUrgencyInfo;
    }

    public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
        this.hotelUrgencyInfo = hotelUrgencyInfo;
    }

    private HotelPricingInfo hotelPricingInfo;

    public HotelPricingInfo getHotelPricingInfo() {
        return this.hotelPricingInfo;
    }

    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    private HotelUrls hotelUrls;

    public HotelUrls getHotelUrls() {
        return this.hotelUrls;
    }

    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    private HotelScores hotelScores;

    public HotelScores getHotelScores() {
        return this.hotelScores;
    }

    public void setHotelScores(HotelScores hotelScores) {
        this.hotelScores = hotelScores;
    }

    @Override
    public String toString() {
        return "Hotel{" + "offerDateRange=" + offerDateRange + ", destination=" + destination + ", hotelInfo=" + hotelInfo + ", hotelUrgencyInfo=" + hotelUrgencyInfo + ", hotelPricingInfo=" + hotelPricingInfo + ", hotelUrls=" + hotelUrls + ", hotelScores=" + hotelScores + '}';
    }

}
