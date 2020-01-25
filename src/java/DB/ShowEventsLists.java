/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Beans.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Eladnani Ahmed Reda
 */
public class ShowEventsLists {
    
    //shows events list
        
        public ArrayList<Event> ShowList() {
			ArrayList<Event> list_events = new ArrayList<Event>();
			try {
				Connection cnx = ConnexionDB.loadDatabase();
				PreparedStatement ps = cnx.prepareStatement("select * from event");
				ResultSet st = ps.executeQuery();
				while(st.next()) {
					Event ev = new Event();
					ev.setId_event(st.getInt("idEvent"));
                                                                                          ev.setTitre_event(st.getString("titre"));
                                                                                          ev.setComm_event(st.getString("commEvent"));
                                                                                          ev.setImage_event(st.getString("imageEvent"));
                                                                                          ev.setId_ass(st.getInt("idAss"));
                                                                                          list_events.add(ev);
				}
				cnx.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return list_events;	
		}
        
        //shows events list for a specific association
        
        public ArrayList<Event> ShowListForAss(int idAss) {
			ArrayList<Event> list_myEvents = new ArrayList<Event>();
			try {
				Connection cnx = ConnexionDB.loadDatabase();
				PreparedStatement ps = cnx.prepareStatement("select * from event where idAss=?");
                                                                        ps.setInt(1, idAss);
				ResultSet st = ps.executeQuery();
				while(st.next()) {
					Event ev = new Event();
					ev.setId_event(st.getInt("idEvent"));
                                                                                          ev.setTitre_event(st.getString("titre"));
                                                                                          ev.setComm_event(st.getString("commEvent"));
                                                                                          ev.setImage_event(st.getString("imageEvent"));
                                                                                          ev.setId_ass(st.getInt("idAss"));
                                                                                          list_myEvents.add(ev);
				}
				cnx.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return list_myEvents;	
		}
		
}
