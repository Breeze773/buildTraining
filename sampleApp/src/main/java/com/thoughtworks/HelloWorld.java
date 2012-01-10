package com.thoughtworks;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class HelloWorld extends HttpServlet {

	private static final String LOGO = "logo.png";
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.print(sayHello(request.getRequestURI(), request.getRemoteAddr()));

        writer.print("<br>");
        writer.print("<IMG src=\"http://www.nmeaf.org/logo.gif\"/>");


    }
	
    protected String sayHello(String requestURI, String remoteAddr) {
        StringBuilder result = new StringBuilder();
        result.append("<html><head><title>Hello World</title></head>");
        result.append("<body><h2>Hello World</h2>");
        result.append("<p>You are currently calling ").append(requestURI);
        result.append(" from ").append(remoteAddr).append("</p>");
        result.append("</body></html>");
        return result.toString();
    }
}
