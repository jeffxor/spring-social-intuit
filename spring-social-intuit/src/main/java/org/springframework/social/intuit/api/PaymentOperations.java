package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.v2.Customer;
import com.intuit.sb.cdm.v2.Payment;


public interface PaymentOperations {
	
	public Payment getPayment(Long id);
	public List<Payment> getPayments();
	public List<Payment> getPayments(Customer customer);
	public Payment update(Payment payments);
	public Payment create(Payment payments);
	/**
	 * Depending on if there is a idType create or update is called. Essentially
	 * a wrapper around create and update to hide the logic.
	 * @param payment Payment item to be persisted to Intuit.
	 * @return Saved Intuit object containing the idType of saved Intuit item.
	 */
	public Payment save(Payment payment);		
	public boolean delete(Payment payments);

}
