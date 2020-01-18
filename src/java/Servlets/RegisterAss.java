
package Servlets;

import Beans.Association;
import DB.AssociationDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eladnani Ahmed Reda
 */
public class RegisterAss extends HttpServlet {

    private static final long serialVersionUID = 1L;
	private final AssociationDB assdb;

    public RegisterAss() {
        this.assdb = new AssociationDB();
    }

    
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       try{
                                    response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		Association ass = new Association();
		ass.setId_association(0);
		ass.setNom_ass(request.getParameter("nom"));
		ass.setDescription_ass(request.getParameter("description"));
		ass.setEmail_ass(request.getParameter("email"));
		ass.setMdp_ass(request.getParameter("mdp"));
                                    ass.setRib(request.getParameter("rib"));
		String a = assdb.getInsert(ass);
		System.out.println(a);
		if(a.equals("sc"))   //On success, you can display a message to user on Home page
		 {
		 request.getRequestDispatcher("/Accueil.html").forward(request, response);
		 }
		 else   //On Failure, display a meaningful message to the User.
		 {
		 request.setAttribute("errMessage", a);
		 request.getRequestDispatcher("/RegisterAss.jsp").forward(request, response);
		 }
       }catch(NullPointerException e){System.out.println("NullPointerException thrown!");}
		
	}
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	 
	        resp.sendRedirect(req.getServletContext().getContextPath()+ "/RegisterAss.jsp");
	    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
