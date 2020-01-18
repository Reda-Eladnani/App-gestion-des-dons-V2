/**
package Servlets;

/**
 *
 * @author Eladnani Ahmed Reda
 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Association;
import DB.AssociationDB;

@WebServlet("/InfosAss")
public class InfosAss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InfosAss() {
        super();
        
    }

	
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect(request.getServletContext().getContextPath()+ "/InfosAssociation.jsp");
	}

	
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AssociationDB assdb = new AssociationDB();
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		Association ass = new Association();
                                    
		try {
			if(status.equals("success")) {
				 HttpSession session = request.getSession();
                                                                         session.setAttribute("nomDonnat", donn.getNom()); 
				response.sendRedirect("ProfilDonn.jsp");
                                                                        System.out.println("cool");
			}else {
				request.setAttribute("test", status );
				out.print(status);
				getServletContext().getRequestDispatcher("/LoginDonnateur.jsp").forward(request, response);
                                                                       
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
*/