package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Event;
import DB.EventDB;

/**
 * Servlet implementation class DeleteHotel
 */
@WebServlet("/SupprimerEvent")
public class SupprimerEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   EventDB eventdb = null;
    public SupprimerEvent() {
        super();
        eventdb = new EventDB();
        		}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titre = request.getParameter("titre");
	 System.out.println(titre);
		boolean a = eventdb.delete(titre);
                 System.out.println("2");
                 if (a == true){
		RequestDispatcher requestdis = request.getRequestDispatcher("ProfilAssociation");
		requestdis.forward(request, response);
                 }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
