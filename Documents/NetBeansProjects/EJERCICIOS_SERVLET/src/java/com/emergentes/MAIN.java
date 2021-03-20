/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Core i3®
 */
@WebServlet(name = "MAIN", urlPatterns = {"/MAIN"})
public class MAIN extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIOS SERVLETS</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LISTA DE EJERCICIOS</h1>");
            out.println("<a href='ejercicio1'>Ejercicio 1</a>");
            out.println("<br>");
            out.println("<a href='ejercicio2'>Ejercicio 2</a>");
            out.println("<br>");
            out.println("<a href='ejercicio3'>Ejercicio 3</a>");
            out.println("<br>");
            out.println("<a href='ejercicio4'>Ejercicio 4</a>");
            out.println("<br>");
            out.println("<a href='ejercicio5'>Ejercicio 5</a>");
            out.println("<br>");
            out.println("<a href='ejercicio6'>Ejercicio 6</a>");
            out.println("<br>");
            out.println("<a href='ejercicio7'>Ejercicio 7</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}



