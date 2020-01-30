
package Servlets;

/**
 *
 * @author Eladnani Ahmed Reda
 **/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Association;
import Beans.Event;
import DB.AssociationDB;
import java.util.ArrayList;

@WebServlet("/InfosAss")
public class InfosAss extends HttpServlet {
	private static final long serialVersionUID = 1L;
                  AssociationDB assdb = null;
	public InfosAss() {
	        super();
	        assdb = new AssociationDB();
	    }

        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
                                    HttpSession session = request.getSession();
                                    int idAss = (int) session.getAttribute("idAsso");
	        	Association ass = assdb.getAsso(idAss);
	        	request.setAttribute("ass", ass);

	      	request.getRequestDispatcher("/InfosAss.jsp").forward(request, response);
	       
		
	}

}
