package com.zhoujx.MyMavenWeb.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;


@WebServlet(name = "MyServlet", urlPatterns = "/myservlet")
public class WorldServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // protected void doGet(HttpServletRequest req, HttpServletResponse: resp) throws ServletException,import java.io.IOException{
        resp.setContentType("text/html;charSet=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>hello world111111</body></html>");
    }
}


