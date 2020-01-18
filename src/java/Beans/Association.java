
package Beans;

import java.io.Serializable;
/**
 *
 * @author Eladnani Ahmed Reda
 */
public class Association implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private int id_association;
    private String email_ass;
    private String nom_ass;
    private String description_ass;
    private String rib;
    private String mdp_ass;
    


    public Association (){
        super();
    }

    public int getId_association() {
        return id_association;
    }

    public void setId_association(int id_association) {
        this.id_association = id_association;
    }

    public String getEmail_ass() {
        return email_ass;
    }

    public void setEmail_ass(String email_ass) {
        this.email_ass = email_ass;
    }

    public String getNom_ass() {
        return nom_ass;
    }

    public void setNom_ass(String nom_ass) {
        this.nom_ass = nom_ass;
    }

    public String getDescription_ass() {
        return description_ass;
    }

    public void setDescription_ass(String description_ass) {
        this.description_ass = description_ass;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getMdp_ass() {
        return mdp_ass;
    }

    public void setMdp_ass(String mpd_ass) {
        this.mdp_ass = mpd_ass;
    }


    public void add(Association ass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}

