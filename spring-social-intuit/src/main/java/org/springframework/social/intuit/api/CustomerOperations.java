package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.qbo.v2.Customer;

public interface CustomerOperations {
	
	public Customer getCustomer(Long id);
	public List<Customer> getCustomers();
	public Customer update(Customer customer);
	public Customer create(Customer customer);
	public boolean delete(Customer customer);

}
