
package DB;

/**
 *
 * @author Eladnani Ahmed Reda
 */

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import Beans.Event;
import java.io.InputStream;
import javax.servlet.http.HttpSession;
        
public class EventDB implements Serializable{
    
    public ArrayList<Event> events = new ArrayList<Event>();
	public ArrayList<Event> getEvents(){
		return events;
	}
        //Get all events
	
	public List<Event> getAll(){

		ArrayList<Event> list_events = new ArrayList<Event>();
		try {
			Connection cnx = ConnexionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from event");
			ResultSet st = ps.executeQuery();
			while(st.next()) {
				Event e = new Event();
				e.setId_event(st.getInt("id_event"));
	        	e.setTitre_event(st.getString("titre_event"));
	            e.setComm_event(st.getString("comm_event"));
	            e.setImage_event( st.getString("image_event"));
	            list_events.add(e);
			}
			cnx.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	return list_events;	
	}
        
                    //Find an event 
	public Event find(String titre) {
		Event event = null;
		try {
			Connection conn = ConnexionDB.loadDatabase();
			System.out.println("hi");
			PreparedStatement ps = conn.prepareStatement("SELECT * from event where titre=?");
			ps.setString(1, titre);
			System.out.println("lol2");
			ResultSet rs = ps.executeQuery();
			System.out.println("hello");
			while (rs.next()) {
				//String titre = rs.getString("titre");
				String  commentaire = rs.getString("commEvent");
				String imagee =  rs.getString("imageEvent");
				int id_ass = rs.getInt("idAss");
                                                                        int id = rs.getInt("idEvent");
				System.out.println("cool");
				event = new Event(id, titre, commentaire, imagee, id_ass );
				System.out.println("wesh");
			}
		}catch(Exception e) {
			System.out.println("die");
			e.printStackTrace();
		}
		return event;
	}
        
        //Insert an event
	public String Addevent(Event h) {
		int rslt = 0;
		Connection cnx = ConnexionDB.loadDatabase();
		System.out.println("coll");
		try {
			System.out.println("hey");
			PreparedStatement ht = cnx.prepareStatement("insert into event(idEvent, titre, commEvent,imageEvent,idAss) values(?,?,?,?,?);");
			
			ht.setString(1, null);
			ht.setString(2, h.getTitre_event());
			ht.setString(3, h.getComm_event());
			ht.setString(4, h.getImage_event());
			System.out.println("pe");
                                                      ht.setInt(5, h.getId_ass());
			rslt =  ht.executeUpdate();
			System.out.println("cooooool");
		}catch(Exception e) {
			System.out.println("sorry");
			e.printStackTrace();
		}
		if(rslt!=0) {
			return "sc";
		}else return "nn";
		
		
	}
        
        //Delete an event
	public boolean delete(int id) {
		try {
			Connection connex  = ConnexionDB.loadDatabase();
			PreparedStatement ps = connex.prepareStatement("DELETE from event where idEvent="+id+";");
			int i = ps.executeUpdate();
			if(i ==1) {
				connex.close();
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
        
        //Update an event
	public boolean update(Event event) {
		try {
			Connection conn = ConnexionDB.loadDatabase();
			PreparedStatement ps = conn.prepareStatement("UPDATE event set commEvent=?, imageEvent=? where titre=?;");
                        System.out.println("dazt lps");
			//ps.setString(1, event.getTitre_event());
			ps.setString(1, event.getComm_event());
			ps.setString(2, event.getImage_event());
			ps.setString(3, event.getTitre_event());
                        System.out.println("dazt set");
			int i = ps.executeUpdate();
                        System.out.println("dazt lupdate");
			if(i == 1) {
				conn.close();
                                  System.out.println("returna true");
				return true;
                              
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
        
        
}
	
	
	
    

