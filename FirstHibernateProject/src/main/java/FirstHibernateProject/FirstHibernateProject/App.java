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

/*Author Nirmalmahesh S */
public class App 
{
    public static void main( String[] args )
    {
    	/*Name n = new Name("Nirmalmahesh"," ","Subramani");
    	
        Alien a1 = new Alien(n,"Gray");*/
    	
    	Alien a1;
    	
    	

        
      /*  Configuration cf = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.getCurrentSession();
*/
        Session session = new Configuration().configure()
        		.addAnnotatedClass(Alien.class)
        		.buildSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
        //session.save(a1);
       
        a1 = (Alien) session.get(Alien.class, 1);
        
        System.out.println(a1);
        tx.commit();
        
        session.close();
        
    }
}
