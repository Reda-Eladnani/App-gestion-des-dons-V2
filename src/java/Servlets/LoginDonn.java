
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

import Beans.Donnateur;
import DB.DonnateurDB;
import DB.AssociationDB;
import Beans.Association;
import java.util.List;

@WebServlet("/LoginDonn")
public class LoginDonn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginDonn() {
        super();
        
    }

	
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect(request.getServletContext().getContextPath()+ "/LoginDonnateur.jsp");
	}

	
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DonnateurDB donndb = new DonnateurDB();
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		Donnateur donn = new Donnateur();
                                    AssociationDB assdb = new AssociationDB();
		donn.setEmail(request.getParameter("email"));
		donn.setMdp(request.getParameter("mdp"));
		String status = donndb.validate(donn);
		try {
			if(status.equals("success")) {
				 HttpSession session = request.getSession();
                                                                         session.setAttribute("nomDonnat", donn.getNom()); 
                                                                         List<Association> listeAsso  = assdb.getAll();
                                                                         session.setAttribute("nomAss",listeAsso.get(0).getNom_ass());
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
