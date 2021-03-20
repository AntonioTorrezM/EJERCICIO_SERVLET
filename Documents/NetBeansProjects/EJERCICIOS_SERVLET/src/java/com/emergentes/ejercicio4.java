
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio4", urlPatterns = {"/ejercicio4"})
public class ejercicio4 extends HttpServlet {

  
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
            out.println("<title>EJERCICIO N°4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CAMBIO DE BOLIVIANOS A DOLARES Y VICEVERSA</h1>");
            out.println("<form action='salida4' method='post'>");
            out.println("<label>Cantidad: </label>");
            out.println("<input type='number' name='numero'>");           
            out.println("<br>");
            out.println("<label>SELECCIONE PREFERENCIA: ");
            out.println("<select name='moneda' id='pa'>");
    	    out.println("<option value='Boliviano_a_Dolar'>BOLIVIANOS A DOLARES</option>");
    	    out.println("<option value='Dolar_a_Boliviano'>DOLARES A BOLIVIANOS</option>");
    	    out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='CAMBIAR'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='MAIN'>VOLVER AL MENU</a>");
            out.println("</body>");
            out.println("</html>");
    }

    }

}
