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
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;



@WebServlet("/ModifierEvent")
public class ModifierEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EventDB eventdb = null;
 
    public ModifierEvent() {
        super();
        eventdb = new EventDB();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
                    String titre = request.getParameter("titre");
                                    PrintWriter out = response.getWriter(); 
		 HttpSession session = request.getSession(true);
                //session.setAttribute("id", request.getParameter("id"));
                //int id = Integer.parseInt((String) session.getAttribute("id"));
		Event ev = eventdb.find(titre);
                System.out.println(titre);
		//ev.setTitre_event(request.getParameter("titre"));
		ev.setComm_event(request.getParameter("comm"));
                                    ev.setImage_event(request.getParameter("image")); 
		boolean rep = eventdb.update(ev);
                                    if (rep == true){
                                        //System.out.println(ev.getTitre_event());
                                        request.setAttribute("ev", ev);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ModificationEvent.jsp");
              
               //request.getRequestDispatcher("/ProfilAss.jsp").forward(request, response);
                                    
                                    dispatcher.forward(request, response);
                                     //request.getRequestDispatcher("/ProfilAss.jsp").forward(request, response);
                                    
                                    }
                                    
		
		
                }
                catch(Exception e) {
				e.printStackTrace();
			}
	}
                

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
                
	}

}
