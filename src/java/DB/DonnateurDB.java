
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


import Beans.Donnateur;

public class DonnateurDB implements Serializable{
	
	public DonnateurDB() {
		super();
	}
	//Récupérer les utilisateurs
	public List<Donnateur> getAll(){
		List<Donnateur> donnateurs = new ArrayList<Donnateur>();
		
		ResultSet resultat = null;
		try {
			Connection cnx = ConnexionDB.loadDatabase();
			PreparedStatement statement = cnx.prepareStatement("SELECT * FROM donnateur;");           
            resultat = statement.executeQuery();
            while(resultat.next()) {
            	int id = resultat.getInt("id_donnateur");
            	String nom = resultat.getString("nom") ;
            	String prenom = resultat.getString("prenom") ;
            	String email = resultat.getString("email") ;
            	String password= resultat.getString("mdp") ;
            	Donnateur donnateur = new Donnateur();
            	donnateur.setId_donnateur(id);
            	donnateur.setNom(nom);
            	donnateur.setPrenom(prenom);
            	donnateur.setEmail(email);
            	donnateur.setMdp(password);
            	donnateur.add(donnateur);
            	cnx.close();
            }
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return donnateurs;
		
	}
	//delete un utilisateur
	public void delete(int id) {
		try {
			Connection cnx = ConnexionDB.loadDatabase();
			PreparedStatement stmt = cnx.prepareStatement("delete from donnateur where id = "+id);
			stmt.executeUpdate();
			cnx.close();
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	//modifier un utilisateur
	public boolean update(Donnateur p) {
		try {
		    Connection connexion = (Connection ) ConnexionDB.loadDatabase();
		    PreparedStatement stmt=connexion.prepareStatement("update donnateur set emailDonn=?,nomDonn=?, prenomDonn=?, mdpDonn=?   where idDonn=?"); 
                                                      stmt.setString(1,p.getEmail());
                                                      stmt.setString(1,p.getNom());
			stmt.setString(2,p.getPrenom());
			stmt.setString(4, p.getMdp());
			stmt.setInt(5, p.getId_donnateur());
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
	public String getInsert(Donnateur p) {
		int rslt = 0;
		Connection cnx = ConnexionDB.loadDatabase();
		System.out.println("coll");
		try {
			System.out.println("hey");
			PreparedStatement ps = cnx.prepareStatement("Insert into donnateur(idDonn,emailDonn,nomDonn,prenomDonn,mdpDonn) values(?,?,?,?,?);");
			System.out.println(ps);
			System.out.println("hello");
			ps.setString(1, null);
                                                      ps.setString(2, p.getEmail());
			ps.setString(3, p.getNom());
			ps.setString(4, p.getPrenom());
                                                      ps.setString(5, p.getMdp());
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
	public String validate(Donnateur p) {
		String status = null;
		
		try {
			Connection cnx = ConnexionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from donnateur");
			ResultSet st = ps.executeQuery();
			String email = p.getEmail();
			String password = p.getMdp();
			while(st.next()) {
				if(email.equals(st.getString("emailDonn"))) {
					if(password.equals(st.getString("mdpDonn"))) {
						status = "success";
                                                                                                           p.setNom(st.getString("nomDonn"));
                                                                                                            break;
                                                                                                            
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

