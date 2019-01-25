package lab8t3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Time")
public class TimeDate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      String title = "Display Current Date & Time";
	      Date date = new Date();
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	         "<html><style>\n" + 
	         "body {background-color: powderblue;}\n" + 
	         "h1   {color: blue;}\n" + 
	         "p    {color: red;}\n" + 
	         "</style>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body >\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<h2 align = \"center\">" + date.toString() + "</h2>\n" +
	            "</body>"+
	         "</html>"
	      );
	}
}
