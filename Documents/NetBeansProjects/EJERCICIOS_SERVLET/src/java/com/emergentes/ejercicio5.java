package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio5", urlPatterns = {"/ejercicio5"})
public class ejercicio5 extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO N°5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>OPERACIONES</h1>");
             out.println("<form action='salida5' method='post'>");
            out.println("<label>Introduzca primer valor: </label>");
            out.println("<input type='number' name='numero1'>");           
            out.println("<br>");
            out.println("<label>Introduzca segundo valor: </label>");
            out.println("<input type='number' name='numero2'>");           
            out.println("<br>");
            out.println("<label>TIPO DE OPERACION: ");
            out.println("<select name='operacion' id='op'>");
    	    out.println("<option value='suma'>SUMA</option>");
    	    out.println("<option value='resta'>RESTA</option>");
    	    out.println("<option value='producto'>PRODUCTO</option>");
    	    out.println("<option value='division'>DIVISION</option>");
    	    out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='PROCESAR'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='MAIN'>VOLVER AL MENU</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}