/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.core;

import com.expedia.model.QueryParameter;

/**
 *
 * @author Bashar Othman
 */
public interface CriteriaProcesses {

    public String generateQueryString();

    public String generateQueryString(QueryParameter parameter);

}
