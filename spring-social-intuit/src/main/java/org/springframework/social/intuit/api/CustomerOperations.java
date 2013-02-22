package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.v2.Customer;

public interface CustomerOperations {
	
	public Customer getCustomer(Long id);
	public List<Customer> getCustomers();
	public Customer update(Customer customer);
	public Customer create(Customer customer);
	/**
	 * Depending on if there is a idType create or update is called. Essentially
	 * a wrapper around create and update to hide the logic.
	 * @param customer Customer item to be persisted to Intuit.
	 * @return Saved Intuit object containing the idType of saved Intuit item.
	 */
	public Customer save(Customer customer);		
	public boolean delete(Customer customer);

}
