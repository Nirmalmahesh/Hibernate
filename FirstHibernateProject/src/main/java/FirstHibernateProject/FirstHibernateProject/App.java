package FirstHibernateProject.FirstHibernateProject;

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
    	
    	Laptop l1 = new Laptop("HP");
    	
    	
    	Student s1= new Student("Nirmalmahesh S",85,l1);
    	
        Session session = new Configuration().configure()
        		.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class)
        		.buildSessionFactory().openSession();
        session.save(l1);
        session.save(s1);
        
        
        Transaction tx = session.beginTransaction();
        
      
       
      
        
      
        tx.commit();
        
        session.close();
        
    }
}
