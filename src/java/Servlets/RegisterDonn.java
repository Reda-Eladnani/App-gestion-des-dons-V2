
package Servlets;

import Beans.Donnateur;
import DB.DonnateurDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 *
 * @author Eladnani Ahmed Reda
 */
public class RegisterDonn extends HttpServlet {

    private static final long serialVersionUID = 1L;
	private final DonnateurDB donndb;

    public RegisterDonn() {
        this.donndb = new DonnateurDB();
    }

    
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       try{
                                    response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		Donnateur donn = new Donnateur();
		donn.setId_donnateur(0);
		donn.setNom(request.getParameter("nom"));
		donn.setPrenom(request.getParameter("prenom"));
		donn.setEmail(request.getParameter("email"));
		donn.setMdp(request.getParameter("mdp"));
		String a = donndb.getInsert(donn);
		System.out.println(a);
		if(a.equals("sc"))   //On success, you can display a message to user on Home page
		 {
                                    
		 request.getRequestDispatcher("/Accueil.html").forward(request, response);
		 }
		 else   //On Failure, display a meaningful message to the User.
		 {
		 request.setAttribute("errMessage", a);
		 request.getRequestDispatcher("/RegisterDonn.jsp").forward(request, response);
		 }
       }catch(NullPointerException e){System.out.println("NullPointerException thrown!");}
       
       
        
		
	}
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	 
	        resp.sendRedirect(req.getServletContext().getContextPath()+ "/RegisterDonn.jsp");
	    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
