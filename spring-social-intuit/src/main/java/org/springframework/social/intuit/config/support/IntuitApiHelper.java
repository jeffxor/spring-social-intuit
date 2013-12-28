package org.springframework.social.intuit.config.support;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.xml.ApiHelper;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.intuit.api.Intuit;

public class IntuitApiHelper implements ApiHelper<Intuit> {
	
	private final static Log logger = LogFactory.getLog(IntuitApiHelper.class);

    private final UsersConnectionRepository usersConnectionRepository;

    private final UserIdSource userIdSource;

    private IntuitApiHelper(UsersConnectionRepository usersConnectionRepository, UserIdSource userIdSource) {
            this.usersConnectionRepository = usersConnectionRepository;
            this.userIdSource = userIdSource;                
    }
    
	@Override
	public Intuit getApi() {
        if (logger.isDebugEnabled()) {
            logger.debug("Getting API binding instance for Intuit");
	    }
	                    
	    Connection<Intuit> connection = usersConnectionRepository.createConnectionRepository(userIdSource.getUserId()).findPrimaryConnection(Intuit.class);
	    if (logger.isDebugEnabled() && connection == null) {
	            logger.debug("No current connection; Returning default IntuitTemplate instance.");
	    }
	    return connection != null ? connection.getApi() : null;
	}

}
