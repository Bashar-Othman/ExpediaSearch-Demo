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
public class HotelScores {

    private double rawAppealScore;

    public double getRawAppealScore() {
        return this.rawAppealScore;
    }

    public void setRawAppealScore(double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    private double movingAverageScore;

    public double getMovingAverageScore() {
        return this.movingAverageScore;
    }

    public void setMovingAverageScore(double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    @Override
    public String toString() {
        return "HotelScores{" + "rawAppealScore=" + rawAppealScore + ", movingAverageScore=" + movingAverageScore + '}';
    }
    
    
}
