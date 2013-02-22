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

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.springframework.social.intuit.builder.PaymentBuilder;

import com.intuit.sb.cdm.v2.Payment;

public class PaymentTemplateTest extends AbstractIntuitApiTest {

	@Test
	public void testGetPayment(){
		Long anyPaymentId = 47L;
		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/payment/v2/132477010/47"))
		.andExpect(method(GET))
		.andRespond(withSuccess(xmlResource("intuit-payment-response"), APPLICATION_XML));
		
		Payment payment = intuit.paymentOperations().getPayment(anyPaymentId);
		
		assertNotNull(payment);
		assertEquals(anyPaymentId.toString(), payment.getId().getValue());
	}
	
	@Test
	public void testGetPayments(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/payments/v2/132477010"))
		.andExpect(method(POST))
		.andRespond(withSuccess(xmlResource("intuit-paymentlist-response"), APPLICATION_XML));
		
		List<Payment> payments = intuit.paymentOperations().getPayments();
		
		assertNotNull(payments);
		assertEquals(1, payments.size());
		Payment payment = payments.get(0);
		assertEquals("47", payment.getId().getValue());
	}


	@Test
	public void testCreatePayment(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/payment/v2/132477010"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-payment-createrequest")))
		.andRespond(withSuccess(xmlResource("intuit-payment-response"), APPLICATION_XML));
		
		Payment defaultPayment = PaymentBuilder.DefaultPayment()
								.build();
		
		Payment payment = intuit.paymentOperations().create(defaultPayment);
		
		assertNotNull(payment);
		assertEquals("47", payment.getId().getValue());
	}	
	
	@Test
	public void testUpdatePayment(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/payment/v2/132477010/47"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-payment-updaterequest")))
		.andRespond(withSuccess(xmlResource("intuit-payment-response"), APPLICATION_XML));
		
		Payment defaultPayment = PaymentBuilder.DefaultPayment()
								.withId(47L)
								.withSyncToken("0")
								.withMetaData("2010-09-14T05:33:24-07:00", "2010-09-14T05:33:24-07:00")
								.withTotalAmount(new BigDecimal("50.00"))
								.build();

		Payment payment = intuit.paymentOperations().update(defaultPayment);
		
		assertNotNull(payment);
		assertEquals("47", payment.getId().getValue());
	}	
	

	@Test
	public void testDeletePayment(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/payment/v2/132477010/47?methodx=delete"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-payment-deleterequest")))
		.andRespond(withSuccess(xmlResource("intuit-payment-deleteresponse"), APPLICATION_XML));
		
		Payment defaultPayment = PaymentBuilder.DefaultPayment()
								.withId(47L)
								.withSyncToken("1")
								.build();
		
		boolean isDeleted = intuit.paymentOperations().delete(defaultPayment);
		
		assertTrue(isDeleted);
	}
	
}