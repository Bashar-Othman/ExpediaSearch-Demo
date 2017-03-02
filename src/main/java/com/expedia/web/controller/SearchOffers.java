/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.web.controller;

import com.expedia.core.CriteriaProcessorManager;
import com.expedia.core.QueryExecutorManager;
import com.expedia.model.Hotel;
import com.expedia.model.QueryParameter;
import com.expedia.util.AppConfigurationUtil;
import com.expedia.util.AppDataUtil;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bashar Othman
 */
public class SearchOffers extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        QueryParameter queryParameter = AppDataUtil.generateQueryParameter(request);

        CriteriaProcessorManager cpm = new CriteriaProcessorManager();
        String queryString = cpm.generateQueryString(queryParameter);

        QueryExecutorManager handler = new QueryExecutorManager();

        request.setAttribute("hotelsList", handler.executeHotelQuery(queryString));
        searchResultForward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void searchResultForward(HttpServletRequest request, HttpServletResponse response) {

        String pageResult = "/result.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(pageResult);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(SearchOffers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchOffers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
