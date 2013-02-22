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
import org.springframework.social.intuit.builder.ItemBuilder;

import com.intuit.sb.cdm.v2.Item;

public class ItemTemplateTest extends AbstractIntuitApiTest {

	@Test
	public void testGetItem(){
		Long anyItemId = 7L;
		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/item/v2/132477010/7"))
		.andExpect(method(GET))
		.andRespond(withSuccess(xmlResource("intuit-item-response"), APPLICATION_XML));
		
		Item item = intuit.itemOperations().getItem(anyItemId);
		
		assertNotNull(item);
		assertEquals(anyItemId.toString(), item.getId().getValue());
	}
	
	@Test
	public void testGetItems(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/items/v2/132477010"))
		.andExpect(method(POST))
		.andRespond(withSuccess(xmlResource("intuit-itemlist-response"), APPLICATION_XML));
		
		List<Item> items = intuit.itemOperations().getItems();
		
		assertNotNull(items);
		assertEquals(1, items.size());
		Item item = items.get(0);
		assertEquals("7", item.getId().getValue());
	}


	@Test
	public void testCreateItem(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/item/v2/132477010"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-item-createrequest")))
		.andRespond(withSuccess(xmlResource("intuit-item-response"), APPLICATION_XML));
		
		Item defaultItem = ItemBuilder.DefaultItem()
								.build();
		
		Item item = intuit.itemOperations().create(defaultItem);
		
		assertNotNull(item);
		assertEquals("7", item.getId().getValue());
	}	
	
	@Test
	public void testUpdateItem(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/item/v2/132477010/7"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-item-updaterequest")))
		.andRespond(withSuccess(xmlResource("intuit-item-response"), APPLICATION_XML));
		
		Item defaultItem = ItemBuilder.DefaultItem()
								.withId(7L)
								.withSyncToken("0")
								.withMetaData("2010-09-13T04:11:06-07:00", "2010-09-13T04:11:06-07:00")
								.withUnitPrice(new BigDecimal("1.5"))
								.build();

		Item item = intuit.itemOperations().update(defaultItem);
		
		assertNotNull(item);
		assertEquals("7", item.getId().getValue());
	}	
	

	@Test
	public void testDeleteItem(){		
		mockServer.expect(requestTo("https://qbo.sbfinance.intuit.com/resource/item/v2/132477010/7?methodx=delete"))
		.andExpect(method(POST))
		.andExpect(content().xml(xmlRequest("intuit-item-deleterequest")))
		.andRespond(withSuccess(xmlResource("intuit-item-deleteresponse"), APPLICATION_XML));
		
		Item defaultItem = ItemBuilder.DefaultItem()
								.withId(7L)
								.withSyncToken("1")								
								.build();

		boolean isDeleted = intuit.itemOperations().delete(defaultItem);
		
		assertTrue(isDeleted);
	}
	
}