package cm.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;




@WebListener
public class UserAccessLoginListener implements HttpSessionAttributeListener {
	
//	private static final String SESSION_ATTRIBUTE_NAME="loginUser";
//
//	
//    public void attributeAdded(HttpSessionBindingEvent se)  {
//    	if(SESSION_ATTRIBUTE_NAME.equals(se.getName())){
//    		User user=(User)se.getValue();
//    		System.out.println(user.getName()+" is login.");
//    	}
//        
//    }
//
//	
//    public void attributeRemoved(HttpSessionBindingEvent se)  { 
//    	if(SESSION_ATTRIBUTE_NAME.equals(se.getName())){
//    		User user=(User)se.getValue();
//    		System.out.println(user.getName()+" is logout.");
//    	}
//    }
//
//	
//    public void attributeReplaced(HttpSessionBindingEvent se)  { 
//         
//    }
	
}
