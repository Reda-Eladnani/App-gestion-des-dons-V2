package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Event;
import DB.AssociationDB;

/**
 * Servlet implementation class DeleteHotel
 */
@WebServlet("/SupprimerAss")
public class SupprimerAss extends HttpServlet {
	private static final long serialVersionUID = 1L;
   AssociationDB eventdb = null;
    public SupprimerAss() {
        super();
        eventdb = new AssociationDB();
        		}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomAss = request.getParameter("nomAss");
	 System.out.println(nomAss);
		boolean a =eventdb.delete(nomAss);
                 System.out.println("2");
                 
//		RequestDispatcher requestdis = request.getRequestDispatcher("ProfilAdmin");
//		requestdis.forward(request, response);
                if (a == true){
		request.getRequestDispatcher("SuppressionAdmin.jsp").forward(request, response);
		
                 }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
