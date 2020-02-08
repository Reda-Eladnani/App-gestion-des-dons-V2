package DB;

import Beans.Administrateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MOUNA
 */
public class AdminDB {
    
    
    public String validate(Administrateur a) {
		String status = null;
		
		try {
			Connection cnx = ConnexionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from admin");
			ResultSet st = ps.executeQuery();
                                                      //String nomAdmin = a.getNomAdmin();
			String email = a.getEmailAdmin();
			String password = a.getMdp();
			while(st.next()) {
				if(email.equals(st.getString("emailAdmin"))) {
					if(password.equals(st.getString("mdp"))) {
						status = "success";  
                                                
					}else {
						status = "Mot de passe  incorrecte";
					}
				}else {
					status = "email not found";
				}
			}
			cnx.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
    
    
    
}