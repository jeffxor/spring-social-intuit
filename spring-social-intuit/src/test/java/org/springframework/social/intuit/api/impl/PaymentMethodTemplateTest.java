package org.springframework.social.intuit.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.MediaType.APPLICATION_XML;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.util.List;

import org.junit.Test;

import com.intuit.sb.cdm.v2.PaymentMethod;

public class PaymentMethodTemplateTest extends AbstractIntuitApiTest {

	@Test
	public void testGetPaymentMethod(){
		Long anyPaymentMethodId = 8L;
		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/payment-method/v2/132477010/8"))
		.andExpect(method(GET))
		.andRespond(withSuccess(xmlResource("intuit-paymentmethod-response"), APPLICATION_XML));
		
		PaymentMethod paymentMethod = intuit.paymentMethodOperations().getPaymentMethod(anyPaymentMethodId);
		
		assertNotNull(paymentMethod);
		assertEquals(anyPaymentMethodId.toString(), paymentMethod.getId().getValue());
	}
	
	@Test
	public void testGetPaymentMethods(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/payment-methods/v2/132477010"))
		.andExpect(method(POST))
		.andRespond(withSuccess(xmlResource("intuit-paymentmethodlist-response"), APPLICATION_XML));
		
		List<PaymentMethod> paymentMethods = intuit.paymentMethodOperations().getPaymentMethods();
		
		assertNotNull(paymentMethods);
		assertEquals(1, paymentMethods.size());
		PaymentMethod paymentMethod = paymentMethods.get(0);
		assertEquals("8", paymentMethod.getId().getValue());
	}

	
}


