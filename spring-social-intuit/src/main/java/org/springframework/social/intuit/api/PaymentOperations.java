package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.qbo.v2.Customer;
import com.intuit.sb.cdm.qbo.v2.Payment;

public interface PaymentOperations {
	
	public Payment getPayment(Long id);
	public List<Payment> getPayments();
	public List<Payment> getPayments(Customer customer);
	public Payment update(Payment payments);
	public Payment create(Payment payments);
	public boolean delete(Payment payments);

}
