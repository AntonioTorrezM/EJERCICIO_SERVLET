package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida4", urlPatterns = {"/salida4"})
public class salida4 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

 
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String var = request.getParameter("numero");
        int mone=Integer.parseInt(var);
        String mo=request.getParameter("moneda");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SALIDA N°4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CAMBIO DE MONEDA DE BOLIVIANO A DOLAR Y VICEVERSA</h1>");
            double cambio;
            String cadena="Boliviano_a_Dolar";
            if(mo.equals(cadena)){
                cambio=mone*0.14;
                out.println("<p>El cambio de "+mone+" Bs es: "+cambio+" $</p>");
            }else{
               cambio=mone*6.90;
                out.println("<p>El cambio de "+mone+" $ es: "+cambio+" Bs</p>");
            }
            out.println("<br>");
            out.println("<a href='ejercicio4'>REGRESAR </a>");
            out.println("<br>");
                out.println("<br>");
            out.println("<a href='MAIN'>VOLVER AL MENU</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }}
