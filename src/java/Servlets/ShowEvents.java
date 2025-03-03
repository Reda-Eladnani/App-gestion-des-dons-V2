package Servlets;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Event;

import DB.ShowEventsLists;

/**
 * Servlet implementation class ShowHotels
 */
@WebServlet("/ShowHotels")
public class ShowEvents extends HttpServlet {
	private static final long serialVersionUID = 1L;
                  ShowEventsLists events = null;
	 public ShowEvents() {
	        super();
	        events = new ShowEventsLists();
	    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	        	 ArrayList<Event> eventsList = events.ShowList(); 
	        	request.setAttribute("eventsList", eventsList);

	      	    request.getRequestDispatcher("/AllEvents.jsp").forward(request, response);
	       
		
	}


}
