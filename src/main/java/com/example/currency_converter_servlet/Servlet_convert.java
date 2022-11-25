package com.example.currency_converter_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_convert", value = "/Servlet_convert")
public class Servlet_convert extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float amount = Float.parseFloat(request.getParameter("amount"));
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Convert USD To VND</h1>");
        out.println("<h1>" + amount + " USD = " + (amount * rate) + " VND</h1>");
        out.println("</body></html>");
    }
}
