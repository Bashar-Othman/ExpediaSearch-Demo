/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.core;

import com.expedia.model.Hotel;
import java.util.List;

/**
 *
 * @author Bashar Othman
 */
public interface QueryExecutor {

    public List<Hotel> executeHotelQuery();

    public List<Hotel> executeHotelQuery(QueryExecutorManager params);
}
