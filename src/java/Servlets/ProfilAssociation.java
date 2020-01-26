package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Event;
import DB.EventDB;
import DB.ShowEventsLists;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowHotels
 */
@WebServlet("/ProfilAssociation")
public class ProfilAssociation extends HttpServlet {
	private static final long serialVersionUID = 1L;
                  ShowEventsLists events = null;
	 public ProfilAssociation() {
	        super();
	        events = new ShowEventsLists();
	    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
                                    HttpSession session = request.getSession();
                                    int idAss = (int) session.getAttribute("idAsso");
	        	ArrayList<Event> eventsAssList = events.ShowListForAss(idAss); 
	        	request.setAttribute("eventsAssList", eventsAssList);

	      	    request.getRequestDispatcher("/ProfilAss.jsp").forward(request, response);
	       
		
	}


}
