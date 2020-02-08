
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


import Beans.Association;

public class AssociationDB implements Serializable{
	
	public AssociationDB() {
		super();
	}
	//Récupérer les associations
	public ArrayList<Association> getAll(){
		ArrayList<Association> associations = new ArrayList<Association>();
		
		//ResultSet st = null;
		try {
			Connection cnx = ConnexionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from association");
			ResultSet st = ps.executeQuery();
                                                        //System.out.println("ba9i madkhl lwhile");
                                                              while(st.next()) {
                                                                   System.out.println("dkhl lwhile");
                                                                int id = st.getInt("idAss");
                                                                 String email = st.getString("emailAss") ;
                                                                String nom = st.getString("nomAss") ;
                                                                
                                                                String description = st.getString("descriptionAss") ;
                                                                String rib= st.getString("rib") ;
                                                                String password= st.getString("mdpAss") ;
                                                                String image = st.getString("imageAss") ;
                                                                
                                                                Association ass = new Association();
                                                                ass.setId_association(id);
                                                                ass.setNom_ass(nom);
                                                                ass.setDescription_ass(description);
                                                                ass.setEmail_ass(email);
                                                                ass.setMdp_ass(password);
                                                                ass.setImageAss(image);
                                                                ass.setRib(rib);
                                                                associations.add(ass);
                                                                System.out.println(nom);
                                                                
            } cnx.close();
                                                              
		}
                catch(Exception e ) {
			e.printStackTrace();
		} 
                
		return associations;
		
	}
	//delete une association
	public boolean delete(String titre) {
		try {
			Connection connex  = ConnexionDB.loadDatabase();
			PreparedStatement ps = connex.prepareStatement("delete from association where nomAss=?;");
                                                        ps.setString(1, titre);
			int i = ps.executeUpdate();
                         System.out.println("hahowa jayy");
			if(i >=1) {
                            System.out.println("t9da gharad");
				connex.close();
				return true;
			}
			
		}catch(Exception e) {
                     System.out.println("finawa ghadi");
			e.printStackTrace();
		}
		return false;
	}
	//modifier une association
	public boolean update(Association p) {
		try {
		    Connection connexion = (Connection ) ConnexionDB.loadDatabase();
		    PreparedStatement stmt=connexion.prepareStatement("update association set emailAss=?,nomAss=?, descriptionAss=?, mdpAss=?, rip=?   where idAss=?"); 
                                                      stmt.setString(1,p.getEmail_ass());
                                                      stmt.setString(1,p.getNom_ass());
			stmt.setString(2,p.getDescription_ass());
			stmt.setString(4, p.getMdp_ass());
                                                        stmt.setString(4, p.getRib());
			stmt.setInt(5, p.getId_association());
			int i =stmt.executeUpdate();
			if(i == 1) {
				connexion.close();
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	//Insérer un utilisateur
	public String getInsert(Association p) {
		int rslt = 0;
		Connection cnx = ConnexionDB.loadDatabase();
		System.out.println("coll");
		try {
			System.out.println("hey");
			PreparedStatement ps = cnx.prepareStatement("Insert into association(idAss,emailAss,nomAss,descriptionAss,rib,mdpAss,imageAss) values(?,?,?,?,?,?,?);");
			System.out.println(ps);
			System.out.println("hello");
			ps.setString(1, null);
                                                      ps.setString(2, p.getEmail_ass());
			ps.setString(3, p.getNom_ass());
			ps.setString(4, p.getDescription_ass());
                                                      ps.setString(5, p.getRib());
                                                      ps.setString(6, p.getMdp_ass());
                                                       ps.setString(7, p.getImageAss());
			System.out.println("pe");
                        
			
			rslt =  ps.executeUpdate();
			System.out.println("cooooool");
		}catch(Exception e) {
			System.out.println("sorry");
			e.printStackTrace();
		}
		if(rslt!=0) {
			return "sc";
		}else return "nn";
		
		
	}
	//Vérifier le login
	public String validate(Association p) {
		String status = null;
		
		try {
			Connection cnx = ConnexionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from association");
			ResultSet st = ps.executeQuery();
			String email = p.getEmail_ass();
			String password = p.getMdp_ass();
			while(st.next()) {
				if(email.equals(st.getString("emailAss"))) {
					if(password.equals(st.getString("mdpAss"))) {
						status = "success";
                                                                                                            p.setId_association(st.getInt("idAss"));
                                                                                                            p.setNom_ass(st.getString("nomAss"));
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
        //Récupérer une association par id
	public Association getAsso(int id){
		Association ass = new Association();
		
		ResultSet resultat = null;
		try {
			Connection cnx = ConnexionDB.loadDatabase();
			PreparedStatement statement = cnx.prepareStatement("SELECT * FROM association where idAss=?;"); 
                                                      statement.setInt(1, id);
                                                        resultat = statement.executeQuery();
                                                        while(resultat.next()) {
                                                            
                                                            String nom = resultat.getString("nomAss") ;
                                                            String description = resultat.getString("descriptionAss") ;
                                                            String email = resultat.getString("emailAss") ;
                                                            String password= resultat.getString("mdpAss") ;
                                                            String rib = resultat.getString("rib");
                                                           
                                                            ass.setNom_ass(nom);
                                                            ass.setDescription_ass(description);
                                                            ass.setEmail_ass(email);
                                                            ass.setMdp_ass(password);
                                                            ass.setRib(rib);
                                                            
                                                            cnx.close();
                                                        }
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return ass;
		
	}

}

