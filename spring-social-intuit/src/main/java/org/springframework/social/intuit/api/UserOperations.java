package org.springframework.social.intuit.api;



/**
 * Interface defining the operations for retrieving information about Intuit users.
 * @author Jeffrey Williams
 */
public interface UserOperations {
	
	String getName();
	String getFirstName();
	String getLastName();
	String getEmailAddress();

	IntuitProfile getUserProfile();

}
