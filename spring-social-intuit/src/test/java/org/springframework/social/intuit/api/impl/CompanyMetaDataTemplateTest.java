package org.springframework.social.intuit.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_XML;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.Test;
import org.springframework.social.intuit.api.CompanyMetaData;

public class CompanyMetaDataTemplateTest extends AbstractIntuitApiTest {

	@Test
	public void testGetAccount(){
		mockServer.expect(requestTo("https://services.intuit.com/sb/company/v2/availableList"))
		.andExpect(method(GET))
		.andRespond(withSuccess(xmlResource("intuit-companylist"), APPLICATION_XML));
		
		CompanyMetaData companyMetaData = intuit.companyMetaDataOperations().getCompanyMetaData();
		
		assertNotNull(companyMetaData);
		assertEquals("132477010", companyMetaData.getCompanyId());
		assertEquals("Digital Assets", companyMetaData.getCompanyName());
	}
	
}