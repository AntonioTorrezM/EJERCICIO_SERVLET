package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida1", urlPatterns = {"/salida1"})
public class salida1 extends HttpServlet {
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre=request.getParameter("nombre");
        
        String var = request.getParameter("fec_nac");
        int fecha=Integer.parseInt(var);
        fecha=2021-fecha;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SALIDA N°1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EDAD ACTUAL</h1>");
            out.println("<p>Nombre: "+ nombre +"</p>");
            out.println("<p>Edad: "+fecha+"</p>");
            out.println("<a href='ejercicio1'>REGRESAR A CALCULAR EDAD</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='MAIN'>VOLVER AL MENU</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
