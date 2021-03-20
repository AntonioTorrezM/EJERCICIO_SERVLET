package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio1", urlPatterns = {"/ejercicio1"})
public class ejercicio1 extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO N° 1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>DATOS PERSONALES</h1>");
            out.println("<form action='salida1' method='post'>");
            out.println("<label>NOMBRE:            </label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<br>");
            out.println("<label>AÑO DE NACIMIENTO: </label>");
            out.println("<input type='number' name='fec_nac'>");        
            out.println("<br>");
            out.println("<input type='submit' value='CALCULAR EDAD'>");        
            out.println("</form>");
            out.println("<br>");
            out.println("<a href='MAIN'>VOLVER AL MENU</a>");
            out.println("</body>");
            out.println("</html>");
        } 
    }
}
