
package Servlets;

/**
 *
 * @author Eladnani Ahmed Reda
 */

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
import Beans.Association;
import java.util.List;

@WebServlet("/LoginAss")
public class LoginAss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginAss() {
        super();
        
    }

	
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect(request.getServletContext().getContextPath()+ "/LoginAssociation.jsp");
	}

	
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AssociationDB assdb = new AssociationDB();
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		Association ass = new Association();
		ass.setEmail_ass(request.getParameter("email"));
		ass.setMdp_ass(request.getParameter("mdp"));
		String status = assdb.validate(ass);
		try {
			if(status.equals("success")) {
				 HttpSession session = request.getSession();
                                                                         session.setAttribute("idAsso", ass.getId_association()); 
                                                                         session.setAttribute("nomAsso", ass.getNom_ass()); 
				response.sendRedirect("http://localhost:8080/AppGestionDons/ProfilAssociation");
                                                                        System.out.println("cool");
			}else {
				request.setAttribute("test", status );
				out.print(status);
				getServletContext().getRequestDispatcher("/LoginAssociation.jsp").forward(request, response);
                                                                       
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
