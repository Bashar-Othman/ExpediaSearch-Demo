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
public class RootObject {

    private OfferInfo offerInfo;

    public OfferInfo getOfferInfo() {
        return this.offerInfo;
    }

    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    private Offers offers;

    public Offers getOffers() {
        return this.offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "RootObject{" + "offerInfo=" + offerInfo + ", userInfo=" + userInfo + ", offers=" + offers + '}';
    }
}
