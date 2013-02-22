package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.v2.Item;


public interface ItemOperations {
	
	public Item getItem(Long id);
	public List<Item> getItems();
	public Item update(Item Item);
	public Item create(Item Item);
	/**
	 * Depending on if there is a idType create or update is called. Essentially
	 * a wrapper around create and update to hide the logic.
	 * @param item Item item to be persisted to Intuit.
	 * @return Saved Intuit object containing the idType of saved Intuit item.
	 */
	public Item save(Item item);	
	public boolean delete(Item Item);

}
