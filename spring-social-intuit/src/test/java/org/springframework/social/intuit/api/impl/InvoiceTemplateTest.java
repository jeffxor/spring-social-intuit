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
import org.springframework.social.intuit.builder.InvoiceBuilder;

import com.intuit.sb.cdm.v2.Invoice;

public class InvoiceTemplateTest extends AbstractIntuitApiTest {

	@Test
	public void testGetInvoice(){
		Long anyInvoiceId = 28L;
		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/invoice/v2/132477010/28"))
		.andExpect(method(GET))
		.andRespond(withSuccess(xmlResource("intuit-invoice-response"), APPLICATION_XML));
		
		Invoice invoice = intuit.invoiceOperations().getInvoice(anyInvoiceId);
		
		assertNotNull(invoice);
		assertEquals(anyInvoiceId.toString(), invoice.getId().getValue());
	}
	
	@Test
	public void testGetInvoices(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/invoices/v2/132477010"))
		.andExpect(method(POST))
		.andRespond(withSuccess(xmlResource("intuit-invoicelist-response"), APPLICATION_XML));
		
		List<Invoice> invoices = intuit.invoiceOperations().getInvoices();
		
		assertNotNull(invoices);
		assertEquals(1, invoices.size());
		Invoice invoice = invoices.get(0);
		assertEquals("28", invoice.getId().getValue());
	}


	@Test
	public void testCreateInvoice(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/invoice/v2/132477010"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-invoice-createrequest")))
		.andRespond(withSuccess(xmlResource("intuit-invoice-response"), APPLICATION_XML));
		
		Invoice defaultInvoice = InvoiceBuilder.DefaultInvoice()
								.withTaxAmount(new BigDecimal("100.00"))
								.withSalesTaxCodeId("1")
								.withSalesTaxCodeName("IS_TAXABLE")
								.build();
		
		Invoice invoice = intuit.invoiceOperations().create(defaultInvoice);
		
		assertNotNull(invoice);
		assertEquals("28", invoice.getId().getValue());
	}	
	
	@Test
	public void testUpdateInvoice(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/invoice/v2/132477010/28"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-invoice-updaterequest")))
		.andRespond(withSuccess(xmlResource("intuit-invoice-response"), APPLICATION_XML));
		
		Invoice defaultInvoice = InvoiceBuilder.DefaultInvoice()
								.withId(28L)
								.withSyncToken("0")
								.withMetaData("2010-09-14T02:22:53-07:00", "2010-09-14T02:22:53-07:00")
								.withTaxRate(new BigDecimal("0.5"))
								.build();

		Invoice invoice = intuit.invoiceOperations().update(defaultInvoice);
		
		assertNotNull(invoice);
		assertEquals("28", invoice.getId().getValue());
	}	
	

	@Test
	public void testDeleteInvoice(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/invoice/v2/132477010/28?methodx=delete"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-invoice-deleterequest")))
		.andRespond(withSuccess(xmlResource("intuit-invoice-deleteresponse"), APPLICATION_XML));
		
		Invoice defaultInvoice = InvoiceBuilder.DefaultInvoice()
								.withId(28L)
								.withSyncToken("1")
								.withMetaData("2010-09-13T01:18:14-07:00", "2010-09-13T01:20:45-07:00")
								.build();
		
		boolean isDeleted = intuit.invoiceOperations().delete(defaultInvoice);
		
		assertTrue(isDeleted);
	}
	
}