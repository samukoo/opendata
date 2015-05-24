package com.samuk.servlets;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samuk.PropertyLoader;
import com.samuk.context.PageContext;

/**
 * Servlet implementation class Parkemeter
 */
@WebServlet(name = "Parkmeter", 
			description = "Parkmeter servlet", 
			urlPatterns = { "/parkmeter/*" })

public class Parkmeter extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PageContext context = new PageContext();   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Parkmeter() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher r = request.getRequestDispatcher("/pages/parkmeter.jsp");
		
		
		PageContext ctx = context.getPageContext(new Integer(request.getParameter("meter")));
		
		request.setAttribute("prop", ctx.prop);
		request.setAttribute("parkmeter", ctx.parkMeter);
		
		r.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
/*
 * System.out.println(request.getContextPath());
		System.out.println(request.getRequestURI().substring(request.getContextPath().length()));
		System.out.println(request.getParameter("meter"));
 */
}
