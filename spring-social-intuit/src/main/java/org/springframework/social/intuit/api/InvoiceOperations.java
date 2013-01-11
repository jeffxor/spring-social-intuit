package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.v2.Customer;
import com.intuit.sb.cdm.v2.Invoice;


public interface InvoiceOperations {
	
	public Invoice getInvoice(Long id);
	public List<Invoice> getInvoices();
	public List<Invoice> getInvoices(Customer customer);
	public Invoice update(Invoice invoice);
	public Invoice create(Invoice invoice);
	/**
	 * Depending on if there is a idType create or update is called. Essentially
	 * a wrapper around create and update to hide the logic.
	 * @param invoice Invoice item to be persisted to Intuit.
	 * @return Saved Intuit Item containing the idType of saved Intuit item.
	 */
	public Invoice save(Invoice invoice);
	public boolean delete(Invoice invoice);

}
