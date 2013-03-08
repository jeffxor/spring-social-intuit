package org.springframework.social.intuit.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.intuit.api.Intuit;
import org.springframework.social.intuit.api.IntuitProfile;

/**
 * Intuit ApiAdapter implementation.
 * @author Jeffrey Williams
 */
public class IntuitAdapter implements ApiAdapter<Intuit> {

	public boolean test(Intuit intuit) {
		try {
			intuit.userOperations().getUserProfile();
			return true;
		} catch (ApiException e) {
			return false;
		}
	}

	public void setConnectionValues(Intuit intuit, ConnectionValues values) {
		IntuitProfile profile = intuit.userOperations().getUserProfile();
		values.setProviderUserId(profile.getName());
		values.setDisplayName(profile.getName());
		values.setProfileUrl(profile.getEmailAddress());
		
	}

	public UserProfile fetchUserProfile(Intuit intuit) {
		IntuitProfile profile = intuit.userOperations().getUserProfile();
		return new UserProfileBuilder().setName(profile.getName()).setUsername(profile.getName()).build();
	}
	
	public void updateStatus(Intuit intuit, String message) {
		//not sure what to do here	
	}
	
}