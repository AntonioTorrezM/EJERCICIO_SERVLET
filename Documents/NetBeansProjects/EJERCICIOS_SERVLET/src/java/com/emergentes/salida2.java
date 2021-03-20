package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "salida2", urlPatterns = {"/salida2"})
public class salida2 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String var = request.getParameter("numero");
        int fac=Integer.parseInt(var);
        int factorial=1;
            for(int i=1; i<=fac; i++){
            factorial=factorial*i;
            }
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SALIDA N°2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>FACTORIAL</h1>");
            out.println("<p>La factorial de " +fac+" es: " +factorial+"</p>");
            out.println("<br>");
            out.println("<a href='ejercicio2'>GENERAR DE NUEVO</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='MAIN'>VOLVER AL MENU</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
