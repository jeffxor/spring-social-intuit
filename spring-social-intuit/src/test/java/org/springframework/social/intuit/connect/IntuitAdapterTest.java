package org.springframework.social.intuit.connect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.intuit.api.Intuit;
import org.springframework.social.intuit.api.IntuitProfile;
import org.springframework.social.intuit.api.UserOperations;

import com.intuit.platform.api.v1.User;

public class IntuitAdapterTest {

	private IntuitAdapter intuitAdapter = new IntuitAdapter();
	
	private Intuit intuit = Mockito.mock(Intuit.class);
	private UserOperations userOperations = Mockito.mock(UserOperations.class);
	private User user = Mockito.mock(User.class);
	private String expectedProfileName = "Jeffrey Williams";
	
	@Test
	public void fetchProfile(){
		Mockito.when(intuit.userOperations()).thenReturn(userOperations);
		Mockito.when(user.getEmailAddress()).thenReturn(expectedProfileName);
		Mockito.when(user.getScreenName()).thenReturn(expectedProfileName);
		IntuitProfile intuitProfile = new IntuitProfile(user);
		Mockito.when(userOperations.getUserProfile()).thenReturn(intuitProfile);
		
		
		UserProfile profile = intuitAdapter.fetchUserProfile(intuit);
		
		assertEquals(expectedProfileName, profile.getName());
		assertEquals(expectedProfileName, profile.getUsername());		
	}
	
}
