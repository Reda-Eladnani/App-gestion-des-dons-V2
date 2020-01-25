package Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_event;
	private String titre_event;
	private String comm_event;
	private String image_event;
	private int id_ass;
	
	
	public Event() {
		super();
	}
	
	
	
	
	
	public Event(int id_event, String titre_event, String comm_event, String image_event, int id_ass) {
		super();
		this.id_event = id_event;
		this.titre_event = titre_event;
		this.comm_event = comm_event;
		this.image_event = image_event;
		this.id_ass = id_ass;
	}

    public int getId_event() {
        return id_event;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public String getTitre_event() {
        return titre_event;
    }

    public void setTitre_event(String titre_event) {
        this.titre_event = titre_event;
    }

    public String getComm_event() {
        return comm_event;
    }

    public void setComm_event(String comm_event) {
        this.comm_event = comm_event;
    }

    public String getImage_event() {
        return image_event;
    }

    public void setImage_event(String image_event) {
        this.image_event = image_event;
    }

    public int getId_ass() {
        return id_ass;
    }

    public void setId_ass(int id_ass) {
        this.id_ass = id_ass;
    }
        
}







	



	