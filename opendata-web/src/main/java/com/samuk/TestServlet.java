package com.samuk;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samuk.opendata.DB.query.DB;
import com.samuk.opendata.objectModels.ParkMeter;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	public void init(ServletConfig servletConfig){
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
    	RequestDispatcher r = request.getRequestDispatcher("pages/boot2.jsp");
    	request.setAttribute("teksti","teksti servletiltä");
    	
    	
    	List<String> test = new ArrayList<String>();
    	test.add("lkjsadlkajda");
    	test.add("kjvxmvnx,mvnxcmvn");
    	
    	DB db = new DB();
    	
    	request.setAttribute("string", test);
    	
    	request.setAttribute("menu", new PropertyLoader().getPropAsList());
    	
    	
    	try {
			
    		List<ParkMeter> lista = db.getParkMeters();
    		
			request.setAttribute("mittarit", lista);
			
			r.forward(request, response);
			
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	
    	
    	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
