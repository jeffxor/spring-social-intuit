package org.springframework.social.intuit.api.impl;

import static org.springframework.http.MediaType.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.web.client.MockRestServiceServer;

public abstract class AbstractIntuitApiTest {

	protected IntuitTemplate intuit;

	protected MockRestServiceServer mockServer;

	@Before
	public void setup() {
		intuit = new IntuitTemplate("API_KEY", "API_SECRET", "ACCESS_TOKEN", "ACCESS_TOKEN_SECRET");
		mockServer = MockRestServiceServer.createServer(intuit.getRestTemplate());
		
		mockServer.expect(requestTo("https://services.intuit.com/sb/company/v2/availableList"))
			.andRespond(withSuccess(xmlResource("intuit-companylist"), APPLICATION_XML));
		
	}
	
	protected Resource xmlResource(String filename) {
		return new ClassPathResource(filename + ".xml", getClass());
	}

	protected String xmlRequest(String filename) {
		try {
			return IOUtils.toString((new ClassPathResource(filename + ".xml", getClass())).getInputStream());
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return "";
	}
}