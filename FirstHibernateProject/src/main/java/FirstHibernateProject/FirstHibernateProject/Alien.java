package FirstHibernateProject.FirstHibernateProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int aid;
	Name name;
	String acolor;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Alien(int aid, Name name, String acolor) {
		super();
		this.aid = aid;
		this.name = name;
		this.acolor = acolor;
	}
	
	public Alien(Name name, String acolor) {
		super();
		this.name = name;
		this.acolor = acolor;
	}
	public Alien() {
		super();
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", acolor=" + acolor +  "]";
	}
	

}
