package FirstHibernateProject.FirstHibernateProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  	
    	   	

        
      /*  Configuration cf = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.getCurrentSession();
        */
    	
    	/*Laptop l1 = new Laptop("HP");
    	Laptop l2 = new Laptop("Dell");
    	Laptop l3 = new Laptop("Acer");
    	Laptop l4 = new Laptop("Toshiba");*/
    	
    	/*List<Laptop> laptop_data = new ArrayList<Laptop>();
    	laptop_data.add(l1);
    	laptop_data.add(l2);
    	
    	Student s1= new Student("Nirmalmahesh S",85,laptop_data);*/
    	
        Session session = new Configuration().configure()
        		.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class)
        		.buildSessionFactory().openSession();
      /*  session.save(l1);
        session.save(l2);
        session.save(l3);
        session.save(l4);
        session.save(s1);*/
        
        
        Student s1 = session.get(Student.class, 5);
        
        //Default It did not query for a collection because it is a lazy 
        System.out.println(s1.getSname());
        
        
        //When i use a colelction its become a Eger it call for a collection
        Collection<Laptop> laptops = s1.getLaptop();
        
        for (Laptop laptop : laptops) {
			System.out.println(laptop.getLid()+" "+laptop.getModel());
		}
        
        Transaction tx = session.beginTransaction();      
      
       
      
        
      
        tx.commit();
        
        session.close();
        
    }
}
