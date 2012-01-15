package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.qbo.v2.Customer;
import com.intuit.sb.cdm.qbo.v2.Invoice;

public interface InvoiceOperations {
	
	public Invoice getInvoice(Long id);
	public List<Invoice> getInvoices();
	public List<Invoice> getInvoices(Customer customer);
	public Invoice update(Invoice invoice);
	public Invoice create(Invoice invoice);
	public boolean delete(Invoice invoice);

}
