package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio3", urlPatterns = {"/ejercicio3"})
public class ejercicio3 extends HttpServlet {
@Override
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO N°3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CALCULAR EDAD</h1>");
            out.println("<form action='ejercicio3' method='post'>");
            out.println("<br>");
            out.println("<label>AÑO DE NACIMIENTO: </label>");
            out.println("<input type='number' name='nacimiento'  min='1900'>");
            out.println("<br>");
            out.println("<input type='submit' value='GENERAR EDAD ACTUAL'>");
            out.println("</form>");
            out.println("<strong><a href='MAIN'>VOLVER AL MENU</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nacimiento;
        int año,edad;
        nacimiento=request.getParameter("nacimiento");
        if(nacimiento!=null){
        año=Integer.parseInt(nacimiento);
        edad=2021-año;
        }else{
            edad=0;
        }

            response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EDAD ACTUAL</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>DATOS RECIBIDOS</h1>");
            out.println("<p>Edad: " +edad+ " años </p>");
            out.println("<br>");
            out.println("<a href='ejercicio3'>GENERAR DE NUEVO</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<strong><a href='ejercicio3'>VOLVER A MENU</a></strong>");
            out.println("</body>");
            out.println("</html>");   
        }
    }
}
