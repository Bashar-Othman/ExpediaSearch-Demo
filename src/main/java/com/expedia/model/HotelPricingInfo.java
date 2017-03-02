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
public class HotelPricingInfo {

    private double averagePriceValue;

    public double getAveragePriceValue() {
        return this.averagePriceValue;
    }

    public void setAveragePriceValue(double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    private double totalPriceValue;

    public double getTotalPriceValue() {
        return this.totalPriceValue;
    }

    public void setTotalPriceValue(double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    private String originalPricePerNight;

    public String getOriginalPricePerNight() {
        return this.originalPricePerNight;
    }

    public void setOriginalPricePerNight(String originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    private double hotelTotalBaseRate;

    public double getHotelTotalBaseRate() {
        return this.hotelTotalBaseRate;
    }

    public void setHotelTotalBaseRate(double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    private double hotelTotalTaxesAndFees;

    public double getHotelTotalTaxesAndFees() {
        return this.hotelTotalTaxesAndFees;
    }

    public void setHotelTotalTaxesAndFees(double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    private String currency;

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private double hotelTotalMandatoryTaxesAndFees;

    public double getHotelTotalMandatoryTaxesAndFees() {
        return this.hotelTotalMandatoryTaxesAndFees;
    }

    public void setHotelTotalMandatoryTaxesAndFees(double hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    private double percentSavings;

    public double getPercentSavings() {
        return this.percentSavings;
    }

    public void setPercentSavings(double percentSavings) {
        this.percentSavings = percentSavings;
    }

    private boolean drr;

    public boolean getDrr() {
        return this.drr;
    }

    public void setDrr(boolean drr) {
        this.drr = drr;
    }

    @Override
    public String toString() {
        return "HotelPricingInfo{" + "averagePriceValue=" + averagePriceValue + ", totalPriceValue=" + totalPriceValue + ", originalPricePerNight=" + originalPricePerNight + ", hotelTotalBaseRate=" + hotelTotalBaseRate + ", hotelTotalTaxesAndFees=" + hotelTotalTaxesAndFees + ", currency=" + currency + ", hotelTotalMandatoryTaxesAndFees=" + hotelTotalMandatoryTaxesAndFees + ", percentSavings=" + percentSavings + ", drr=" + drr + '}';
    }

}
