/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bashar Othman
 */
public final class AppConfigurationUtil {

    private static Properties properties;

    static {
        init();
    }

    private static void init() {

        if (properties == null) {
            try {
                initializeProprties();
            } catch (IOException ex) {
                Logger.getLogger(AppConfigurationUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static void initializeProprties() throws IOException {

        properties = new Properties();
        ClassLoader cl = AppConfigurationUtil.class.getClassLoader();
        InputStream inConfig = cl.getResourceAsStream("configuration"+File.separator+"config.properties");
        properties.load(inConfig);

    }

    public static String jsonURL() {

        return properties.getProperty("com.expedia.json.src");

    }

    public static String destinationNameLbl() {

        return properties.getProperty("com.expedia.serach.hotel.by.destinationName");

    }

    public static String minTripStartDateLbl() {

        return properties.getProperty("com.expedia.serach.hotel.by.minTripStartDate");

    }

    public static String maxTripStartDateLbl() {

        return properties.getProperty("com.expedia.serach.hotel.by.maxTripStartDate");

    }

    public static String lengthOfStayLbl() {

        return properties.getProperty("com.expedia.serach.hotel.by.lengthOfStay");

    }

    public static String minStarRatingLbl() {

        return properties.getProperty("com.expedia.serach.hotel.by.minStarRating");

    }

    public static String maxStarRatingLbl() {

        return properties.getProperty("com.expedia.serach.hotel.by.maxStarRating");

    }

    public static String minGuestRatingLbl() {

        return properties.getProperty("com.expedia.serach.hotel.by.minGuestRating");

    }

    public static String maxGuestRatingLbl() {

        return properties.getProperty("com.expedia.serach.hotel.by.maxGuestRating");

    }

    public static String searchDefaultScenarioParam() {

        return properties.getProperty("com.expedia.search.scenario");

    }

    public static String searchDefaultPageParam() {

        return properties.getProperty("com.expedia.search.page");

    }

    public static String searchDefaulUID() {

        return properties.getProperty("com.expedia.search.uid");

    }

    public static String searchDefaulProductType() {

        return properties.getProperty("com.expedia.search.productType");

    }

}
