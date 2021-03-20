package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio2", urlPatterns = {"/ejercicio2"})
public class ejercicio2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO N°2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CALCULAR FACTORIAL</h1>");
             out.println("<form action='salida2' method='post'>");
            out.println("<label>NUMERO: </label>");
            out.println("<input type='number' name='numero'>");        
            out.println("<br>");
            out.println("<input type='submit' value='GENERAR FACTORIAL'>");        
            out.println("</form>");
            out.println("<br>");
            out.println("<a href='MAIN'>VOLVER AL MENU</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
