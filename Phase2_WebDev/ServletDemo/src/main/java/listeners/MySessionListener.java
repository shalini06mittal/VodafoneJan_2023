package listeners;

import java.util.Enumeration;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public MySessionListener() {
    	System.out.println("My session Listener");
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("My session Listener created");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("\n***************************\n");
    	System.out.println("My session Listener destroyed");
    	HttpSession sess = se.getSession();
    	Enumeration<String> enumeration = sess.getAttributeNames();
    	while(enumeration.hasMoreElements())
    	{
    		String key = enumeration.nextElement();
    		System.out.println(sess.getAttribute(key));
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  {
    	System.out.println("\n***************************\n");
    	System.out.println("My session Listener add attribute");
    	HttpSession sess = se.getSession();
    	Enumeration<String> enumeration = sess.getAttributeNames();
    	while(enumeration.hasMoreElements())
    		System.out.println(enumeration.nextElement());
    	
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("\n***************************\n");
    	System.out.println("My session Listener attribute removed");
//    	HttpSession sess = se.getSession();
//    	Enumeration<String> enumeration = sess.getAttributeNames();
//    	while(enumeration.hasMoreElements())
//    		System.out.println(enumeration.nextElement());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("My session Listener attribute replaced");
    }
	
}
