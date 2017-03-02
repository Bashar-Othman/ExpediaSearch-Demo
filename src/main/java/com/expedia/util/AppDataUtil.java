/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.util;

import com.expedia.model.Hotel;
import com.expedia.model.QueryParameter;
import com.expedia.model.RootObject;
import java.net.MalformedURLException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Bashar Othman
 */
public final class AppDataUtil {

    public static final String HOTEL_LIST_ATTRIBUTE_NAME = "hotelsList";

    public static RootObject generateObjectfromJson(String urlOfJSON) throws MalformedURLException, IOException {

        if (urlOfJSON == null || urlOfJSON.trim().equals("")) {

            return null;

        }
        ObjectMapper mapper = new ObjectMapper();
        RootObject obj = mapper.readValue(new URL(urlOfJSON), RootObject.class);

        return obj;
    }

    public static QueryParameter generateQueryParameter(HttpServletRequest httpServletRequest) {

        String destinationNameParam = httpServletRequest.getParameter("destination");

        String regionID = httpServletRequest.getParameter("regionid");

        String minTripStartDate = formatDate(httpServletRequest.getParameter("minStartTripDate"));
        String maxTripStartDate = formatDate(httpServletRequest.getParameter("maxStartTripDate"));

        String minHotelRate = httpServletRequest.getParameter("minrate");
        String maxHotelRate = httpServletRequest.getParameter("maxrate");

        String lengthOfStay = httpServletRequest.getParameter("lengthOfStay");

        String carPackage = httpServletRequest.getParameter("car");

        QueryParameter queryParameter = new QueryParameter(destinationNameParam, minTripStartDate, maxTripStartDate, minHotelRate, maxHotelRate, "0", " 0", carPackage, lengthOfStay);

        return queryParameter;
    }

    public static int parseFromStringToInt(String val) {
        int valInt = -1;
        if (val != null && val.length() > 0) {
            valInt = Integer.parseInt(val);
        }
        return valInt;
    }

    public static void main(String[] po) throws IOException {
        String jsonURL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationName=New%20York";
        RootObject object = AppDataUtil.generateObjectfromJson(jsonURL);
        System.out.println("RootObject : " + object.getOffers().getHotel().size());

        for (Hotel h : object.getOffers().getHotel()) {
            System.out.println("Hotel : " + h);
        }
    }

    public static boolean isEmpty(String val) {

        if (val != null && !val.trim().equals("")) {
            return false;
        }
        return true;
    }

    public static String formatDate(String dateString) {
        if (!isEmpty(dateString)) {

            String[] tokens = dateString.split("/");
            String formatedDate = tokens[2] + "-" + tokens[1] + "-" + tokens[0];
            return formatedDate;
        }
        return "";
    }

}
