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
public class QueryParameter {

    private String destinationName;

    private String minStartDate;
    private String maxStartDate;

    private String minStartRating;
    private String maxStarRating;

    private String minGuestRating;
    private String maxGuestRating;

    private String carPackage;

    private String lengthOfStay;

    public QueryParameter(String destinationName, String minStartDate, String maxStartDate, String minStartRating, String maxStarRating, String minGuestRating, String maxGuestRating, String carPackage, String lengthOfStay) {
        this.destinationName = destinationName;
        this.minStartDate = minStartDate;
        this.maxStartDate = maxStartDate;
        this.minStartRating = minStartRating;
        this.maxStarRating = maxStarRating;
        this.minGuestRating = minGuestRating;
        this.maxGuestRating = maxGuestRating;
        this.carPackage = carPackage;
        this.lengthOfStay = lengthOfStay;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public String getMinStartDate() {
        return minStartDate;
    }

    public String getMaxStartDate() {
        return maxStartDate;
    }

    public String getMinStartRating() {
        return minStartRating;
    }

    public void setMinStartRating(String minStartRating) {
        this.minStartRating = minStartRating;
    }

    public String getMaxStarRating() {
        return maxStarRating;
    }

    public void setMaxStarRating(String maxStarRating) {
        this.maxStarRating = maxStarRating;
    }

    public String getMinGuestRating() {
        return minGuestRating;
    }

    public void setMinGuestRating(String minGuestRating) {
        this.minGuestRating = minGuestRating;
    }

    public String getMaxGuestRating() {
        return maxGuestRating;
    }

    public void setMaxGuestRating(String maxGuestRating) {
        this.maxGuestRating = maxGuestRating;
    }

    public String getCarPackage() {
        return carPackage;
    }

    public void setCarPackage(String carPackage) {
        this.carPackage = carPackage;
    }

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    @Override
    public String toString() {
        return "QueryParameter{" + "destinationName=" + destinationName + ", minStartDate=" + minStartDate + ", maxStartDate=" + maxStartDate + ", minStartRating=" + minStartRating + ", maxStarRating=" + maxStarRating + ", minGuestRating=" + minGuestRating + ", maxGuestRating=" + maxGuestRating + '}';
    }

}
