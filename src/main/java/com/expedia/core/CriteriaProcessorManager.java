/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.core;

import com.expedia.model.QueryParameter;
import com.expedia.util.AppConfigurationUtil;
import com.expedia.util.AppDataUtil;

/**
 *
 * @author Bashar Othman
 */
public final class CriteriaProcessorManager implements CriteriaProcesses {

    public String generateQueryString() {

        StringBuilder queryString = new StringBuilder();
        String jsonURL = AppConfigurationUtil.jsonURL();

        appendDefaultParams(queryString, jsonURL);

        return queryString.toString();
    }

    private void appendDefaultParams(StringBuilder builder, String url) {

        builder.append(url);
        builder.append("?" + AppConfigurationUtil.searchDefaultScenarioParam() + "=deal-finder");
        builder.append("&" + AppConfigurationUtil.searchDefaulUID() + "=foo");
        builder.append("&" + AppConfigurationUtil.searchDefaultPageParam() + "=foo");
        builder.append("&" + AppConfigurationUtil.searchDefaulProductType() + "=Hotel");

    }

    public String generateQueryString(QueryParameter parameter) {
        StringBuilder builder = new StringBuilder();
        String jsonURL = AppConfigurationUtil.jsonURL();

        appendDefaultParams(builder, jsonURL);
        appendClientParams(builder, parameter);

        return builder.toString();

    }

    private void appendClientParams(StringBuilder builder, QueryParameter queryParameter) {

        if (!AppDataUtil.isEmpty(queryParameter.getDestinationName())) {
            builder.append("&destinationName" + "=" + queryParameter.getDestinationName());
        }

        if (!AppDataUtil.isEmpty(queryParameter.getMinStartDate())) {

            builder.append("&minTripStartDate" + "=" + queryParameter.getMinStartDate());
        }
        if (!AppDataUtil.isEmpty(queryParameter.getMaxStartDate())) {

            builder.append("&maxTripStartDate" + "=" + queryParameter.getMaxStartDate());
        }
        if (!AppDataUtil.isEmpty(queryParameter.getLengthOfStay())) {

            builder.append("&lengthOfStay" + "=" + queryParameter.getLengthOfStay());

        }
        if (!AppDataUtil.isEmpty(queryParameter.getMinStartRating())) {

            builder.append("&minStarRating" + "=" + queryParameter.getMinStartRating());
        }

        if (!AppDataUtil.isEmpty(queryParameter.getMaxStarRating())) {

            builder.append("&maxStarRating" + "=" + queryParameter.getMaxStarRating());
        }
    }

}
