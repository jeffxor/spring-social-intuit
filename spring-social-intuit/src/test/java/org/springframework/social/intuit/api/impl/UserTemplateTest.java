package org.springframework.social.intuit.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_XML;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.Test;
import org.springframework.social.intuit.api.IntuitProfile;

public class UserTemplateTest extends AbstractIntuitApiTest {

	@Test
	public void testGetUserProfile(){
		
		mockServer.expect(requestTo("https://qbo.intuit.com/qbo1/rest/user/v2/132477010"))
		.andExpect(method(GET))
		.andRespond(withSuccess(xmlResource("intuit-user-response"), APPLICATION_XML));
		
		IntuitProfile userProfile = intuit.userOperations().getUserProfile();
		
		assertNotNull(userProfile);
		assertEquals("ipp.intuit.com+dr@gmail.com", userProfile.getName());
	}
		
}

