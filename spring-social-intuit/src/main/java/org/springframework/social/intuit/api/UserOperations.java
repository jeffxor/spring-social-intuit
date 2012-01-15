package org.springframework.social.intuit.api;



/**
 * Interface defining the operations for retrieving information about Intuit users.
 * @author Jeffrey Williams
 */
public interface UserOperations {

	
	String getName();
	String getTicket();
	String getAgentId();
	String getCompanyId();
	String getBaseUrl();

	IntuitProfile getUserProfile();

}
