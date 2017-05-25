/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundoweb.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author tiago.lucas
 */
public class OlaServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("Olá Mundo!");
        System.out.println("Meu primeiro Servlet!");
    }
}
