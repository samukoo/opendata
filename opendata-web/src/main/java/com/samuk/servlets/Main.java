package com.samuk.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samuk.PropertyLoader;
import com.samuk.opendata.DB.query.DB;

@WebServlet(
		description = "servlet for main page", 
		urlPatterns = { "/main" }, 
		initParams = { 
				@WebInitParam(name = "one", value = "1")
		})
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Main() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher r = request.getRequestDispatcher("/pages/main.jsp");
		
		PropertyLoader pl = new PropertyLoader();
		
		request.setAttribute("prop", pl.getProperties("page_text.properties"));
		request.setAttribute("menuitems", pl.getPropAsList());
		
		try {
			request.setAttribute("mittarit", new DB().getParkMeters());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		r.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
