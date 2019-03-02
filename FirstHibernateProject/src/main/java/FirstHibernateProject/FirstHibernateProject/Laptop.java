package FirstHibernateProject.FirstHibernateProject;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Laptop {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	int lid;
	String model;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Laptop() {
		super();
	}
	
	

}
