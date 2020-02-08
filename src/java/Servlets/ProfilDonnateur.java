package Servlets;

import Beans.Association;
import java.io.IOException;

import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import DB.AssociationDB;


@WebServlet("/ProfilDonnateur")
public class ProfilDonnateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
                  AssociationDB assdb = null;
	public ProfilDonnateur() {
	        super();
	        assdb = new AssociationDB();
	    }

        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
                                   // HttpSession session = request.getSession();
                                   // int idAss = (int) session.getAttribute("idAsso");
                                   System.out.println("wesh from servlet");
	        	ArrayList<Association> AssList = assdb.getAll();
                        System.out.println("wesh be3d getAll");
	        	request.setAttribute("AssList", AssList);
System.out.println("tsaftat la list l jsp");
	      	request.getRequestDispatcher("/ProfilDonn.jsp").forward(request, response);
                System.out.println("wayli");
	       
		
	}


}