package org.springframework.social.intuit.api.impl;

import java.util.List;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.ItemOperations;
import org.springframework.web.client.RestTemplate;

import com.intuit.sb.cdm.v2.Item;
import com.intuit.sb.cdm.v2.Items;
import com.intuit.sb.cdm.qbo.SearchResults;

public class ItemTemplate implements ItemOperations {
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	private final String companyId;
	private final String baseUrl;

	public ItemTemplate(boolean isAuthorized, RestTemplate restTemplate, String companyId, String baseUrl) {
		super();
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
		this.companyId = companyId;
		this.baseUrl = baseUrl;
	}

	public Item getItem(Long itemId) {
		requireAuthorization();
		return restTemplate.getForObject("{baseURL}/resource/item/v2/{companyId}/{itemID}", Item.class, baseUrl, companyId, itemId);
	}

	public List<Item> getItems() {
		requireAuthorization();		
		SearchResults response = restTemplate.postForObject("{baseURL}/resource/items/v2/{companyId}", null, SearchResults.class, baseUrl, companyId);
		if(response != null){
			return ((Items)response.getCdmCollections()).getItems();
		}
		return null;
	}

	public Item update(Item item) {
		requireAuthorization();
		return restTemplate.postForObject("{baseURL}/resource/item/v2/{companyId}/{itemID}", item, Item.class, baseUrl, companyId, item.getId().getValue());
	}

	public Item create(Item item) {
		requireAuthorization();
		return restTemplate.postForObject("{baseURL}/resource/item/v2/{companyId}", item, Item.class, baseUrl, companyId);
	}

	public Item save(Item item) {
		requireAuthorization();
		if(item.getId() != null && item.getId().getValue() != null){
			return update(item);
		}
		else {
			return create(item);
		}
	}

	public boolean delete(Item item) {
		requireAuthorization();
		Item response = restTemplate.postForObject("{baseURL}/resource/item/v2/{companyId}/{itemID}?methodx=delete", buildDelete(item), Item.class, baseUrl, companyId, item.getId().getValue());
		return (response.getId() == null);
	}
	
	private Item buildDelete(Item item){
		Item delete = new Item();
		delete.setSyncToken(item.getSyncToken());
		delete.setId(item.getId());
		
		return delete;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("intuit");
		}
	}

}
