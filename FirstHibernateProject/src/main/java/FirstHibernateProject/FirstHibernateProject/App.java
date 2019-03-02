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
        Session session = new Configuration().configure()
        		.buildSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
      
       
      
        
      
        tx.commit();
        
        session.close();
        
    }
}
