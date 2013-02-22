package org.springframework.social.intuit.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.MediaType.APPLICATION_XML;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.util.List;

import org.junit.Test;
import org.springframework.social.intuit.builder.CustomerBuilder;

import com.intuit.sb.cdm.v2.Customer;

public class CustomerTemplateTest extends AbstractIntuitApiTest {

	@Test
	public void testGetCustomer(){
		Long anyCustomerId = 17L;
		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/customer/v2/132477010/17"))
		.andExpect(method(GET))
		.andRespond(withSuccess(xmlResource("intuit-customer-response"), APPLICATION_XML));
		
		Customer customer = intuit.customerOperations().getCustomer(anyCustomerId);
		
		assertNotNull(customer);
		assertEquals(anyCustomerId.toString(), customer.getId().getValue());
		assertEquals("John Doe", customer.getName());
	}
	
	@Test
	public void testGetCustomers(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/customers/v2/132477010"))
		.andExpect(method(POST))
		.andRespond(withSuccess(xmlResource("intuit-customerlist-response"), APPLICATION_XML));
		
		List<Customer> customers = intuit.customerOperations().getCustomers();
		
		assertNotNull(customers);
		assertEquals(1, customers.size());
		Customer customer = customers.get(0);
		assertEquals("17", customer.getId().getValue());
		assertEquals("John Doe", customer.getName());
	}


	@Test
	public void testCreateCustomer(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/customer/v2/132477010"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-customer-createrequest")))
		.andRespond(withSuccess(xmlResource("intuit-customer-response"), APPLICATION_XML));
		
		Customer defaultCustomer = CustomerBuilder.DefaultCustomer()
								.withMobileNumber("(770) 349-1200")
								.withFaxNumber("(770) 349-1300")
								.build();
		
		Customer customer = intuit.customerOperations().create(defaultCustomer);
		
		assertNotNull(customer);
		assertEquals("17", customer.getId().getValue());
		assertEquals("John Doe", customer.getName());
	}	
	
	@Test
	public void testUpdateCustomer(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/customer/v2/132477010/17"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-customer-updaterequest")))
		.andRespond(withSuccess(xmlResource("intuit-customer-response"), APPLICATION_XML));
		
		Customer defaultCustomer = CustomerBuilder.DefaultCustomer()
								.withId(17L)
								.withSyncToken("0")
								.withMetaData("2010-09-13T02:09:18-07:00", "2010-09-13T02:09:18-07:00")
								.withMobileNumber("(770) 349-4200")
								.withAddressLine2("")
								.build();

		Customer customer = intuit.customerOperations().update(defaultCustomer);
		
		assertNotNull(customer);
		assertEquals("17", customer.getId().getValue());
		assertEquals("John Doe", customer.getName());
	}	

	@Test
	public void testDeleteCustomer(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/customer/v2/132477010/17?methodx=delete"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-customer-deleterequest")))
		.andRespond(withSuccess(xmlResource("intuit-customer-deleteresponse"), APPLICATION_XML));
		
		Customer defaultCustomer = CustomerBuilder.DefaultCustomer()
								.withId(17L)
								.withSyncToken("1")
								.withMetaData("2010-09-13T01:18:14-07:00", "2010-09-13T01:20:45-07:00")
								.build();
		
		boolean isDeleted = intuit.customerOperations().delete(defaultCustomer);
		
		assertTrue(isDeleted);
	}
	
}