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
public class OfferInfo {

    private String siteID;

    public String getSiteID() {
        return this.siteID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    private String language;

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String currency;

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "OfferInfo{" + "siteID=" + siteID + ", language=" + language + ", currency=" + currency + '}';
    }
}
