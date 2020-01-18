
package Beans;

import java.io.Serializable;
/**
 *
 * @author Eladnani Ahmed Reda
 */
public class Donnateur implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private int id_donnateur;
    private String email;
    private String nom;
    private String prenom;
    private String mdp;
    


    public Donnateur (){
        super();
    }

    public int getId_donnateur() {
        return id_donnateur;
    }

    public void setId_donnateur(int id_donnateur) {
        this.id_donnateur = id_donnateur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void add(Donnateur donnateur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
