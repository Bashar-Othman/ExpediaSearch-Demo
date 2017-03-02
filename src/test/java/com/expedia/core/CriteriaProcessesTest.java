/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.core;

import com.expedia.model.QueryParameter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author u467
 */
public class CriteriaProcessesTest {

    public CriteriaProcessesTest() {
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
     * Test of generateQueryString method, of class CriteriaProcesses.
     */
    @Test
    public void testGenerateQueryString() {
        System.out.println("generateQueryString");
        CriteriaProcesses instance = new CriteriaProcessesImpl();
        String expResult = "";
        String result = instance.generateQueryString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of generateQueryString method, of class CriteriaProcesses.
     */
    @Test
    public void testGenerateQueryString_QueryParameter() {
        System.out.println("generateQueryString");
        QueryParameter parameter = null;
        CriteriaProcesses instance = new CriteriaProcessesImpl();
        String expResult = "";
        String result = instance.generateQueryString(parameter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class CriteriaProcessesImpl implements CriteriaProcesses {

        public String generateQueryString() {
            return "";
        }

        public String generateQueryString(QueryParameter parameter) {
            return "";
        }
    }

}
