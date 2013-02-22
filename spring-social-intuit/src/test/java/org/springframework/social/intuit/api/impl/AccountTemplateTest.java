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
import org.springframework.social.intuit.builder.AccountBuilder;

import com.intuit.sb.cdm.v2.Account;

public class AccountTemplateTest extends AbstractIntuitApiTest {

	@Test
	public void testGetAccount(){
		Long anyAccountId = 44L;
		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/account/v2/132477010/44"))
		.andExpect(method(GET))
		.andRespond(withSuccess(xmlResource("intuit-account-response"), APPLICATION_XML));
		
		Account account = intuit.accountOperations().getAccount(anyAccountId);
		
		assertNotNull(account);
		assertEquals(anyAccountId.toString(), account.getId().getValue());
		assertEquals("Loan Account", account.getName());
	}
	
	@Test
	public void testGetAccounts(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/accounts/v2/132477010"))
		.andExpect(method(POST))
		.andRespond(withSuccess(xmlResource("intuit-accountlist-response"), APPLICATION_XML));
		
		List<Account> accounts = intuit.accountOperations().getAccounts();
		
		assertNotNull(accounts);
		assertEquals(1, accounts.size());
		Account account = accounts.get(0);
		assertEquals("44", account.getId().getValue());
		assertEquals("Loan Account", account.getName());
	}

	@Test
	public void testGetBankAccounts(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/accounts/v2/132477010"))
		.andExpect(method(POST))
		.andRespond(withSuccess(xmlResource("intuit-accountlist-response"), APPLICATION_XML));
		
		List<Account> accounts = intuit.accountOperations().getBankAccounts();
		
		assertNotNull(accounts);
		assertEquals(1, accounts.size());
		Account account = accounts.get(0);
		assertEquals("44", account.getId().getValue());
		assertEquals("Savings", account.getSubtype());
	}

	@Test
	public void testCreateAccount(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/account/v2/132477010"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-account-createrequest")))
		.andRespond(withSuccess(xmlResource("intuit-account-response"), APPLICATION_XML));
		
		Account defaultAccount = AccountBuilder.DefaultAccount()
								.withOpeningBalanceDate("2010-05-14")
								.build();
		
		Account account = intuit.accountOperations().create(defaultAccount);
		
		assertNotNull(account);
		assertEquals("44", account.getId().getValue());
		assertEquals("Savings", account.getSubtype());
	}	
	
	@Test
	public void testUpdateAccount(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/account/v2/132477010/44"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-account-updaterequest")))
		.andRespond(withSuccess(xmlResource("intuit-account-response"), APPLICATION_XML));
		
		Account defaultAccount = AccountBuilder.DefaultAccount()
								.withDescription("Loan account type")
								.withId(44L)
								.withSyncToken("1")
								.withMetaData("2010-09-13T01:18:14-07:00", "2010-09-13T01:20:45-07:00")
								.build();
		
		Account account = intuit.accountOperations().update(defaultAccount);
		
		assertNotNull(account);
		assertEquals("44", account.getId().getValue());
		assertEquals("Savings", account.getSubtype());
	}	

	@Test
	public void testDeleteAccount(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/account/v2/132477010/44?methodx=delete"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-account-deleterequest")))
		.andRespond(withSuccess(xmlResource("intuit-account-deleteresponse"), APPLICATION_XML));
		
		Account defaultAccount = AccountBuilder.DefaultAccount()
								.withId(44L)
								.withSyncToken("1")
								.withMetaData("2010-09-13T01:18:14-07:00", "2010-09-13T01:20:45-07:00")
								.build();
		
		boolean isDeleted = intuit.accountOperations().delete(defaultAccount);
		
		assertTrue(isDeleted);
	}
	
}