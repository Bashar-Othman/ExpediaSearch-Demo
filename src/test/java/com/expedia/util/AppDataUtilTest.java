/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.util;

import com.expedia.model.RootObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bashar Othman
 */
public class AppDataUtilTest {

    public AppDataUtilTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of generateObjectfromJson method, of class AppDataUtil.
     */
    @Test
    public void testGenerateObjectfromJson() throws Exception {
        System.out.println("generateObjectfromJson");
        String urlOfJSON = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationName=New%20York";
        //String urlOfJSON = "";
        RootObject expResult = null;
        RootObject result = AppDataUtil.generateObjectfromJson(urlOfJSON);

        assertNotNull("JSON Must be NOT NULL", result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of main method, of class AppDataUtil.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] po = null;
        AppDataUtil.main(po);
        // TODO review the generated test code and remove the default call to fail.
    }

}
