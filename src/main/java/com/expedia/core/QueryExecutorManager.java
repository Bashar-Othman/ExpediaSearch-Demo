/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.core;

import com.expedia.model.Hotel;
import com.expedia.util.AppDataUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bashar Othman
 */
public class QueryExecutorManager {

    public List<Hotel> executeHotelQuery() {

        List<Hotel> hotels = new ArrayList<Hotel>();
        CriteriaProcessorManager cpm = new CriteriaProcessorManager();

        try {
            hotels = AppDataUtil.generateObjectfromJson(cpm.generateQueryString()).getOffers().getHotel();
        } catch (IOException ex) {
            Logger.getLogger(QueryExecutorManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hotels;
    }

    public List<Hotel> executeHotelQuery(String queryString) {

        List<Hotel> hotels = new ArrayList<Hotel>();

        try {
            hotels = AppDataUtil.generateObjectfromJson(queryString.replace(" ", "%20")).getOffers().getHotel();
        } catch (IOException ex) {
            Logger.getLogger(QueryExecutorManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hotels;
    }

}
