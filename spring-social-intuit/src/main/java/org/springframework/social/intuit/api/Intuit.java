package org.springframework.social.intuit.api;

import org.springframework.social.ApiBinding;

public interface Intuit extends ApiBinding {
	
	/**
	 * Returns the portion of the Intuit API containing the user operations.
	 */
	UserOperations userOperations();
	
	AccountOperations accountOperations();
	
	CompanyMetaDataOperations companyMetaDataOperations();
	
	CustomerOperations customerOperations();
	
	PaymentOperations paymentOperations();
	
	PaymentMethodOperations paymentMethodOperations();
	
	InvoiceOperations invoiceOperations();
	
	ItemOperations itemOperations();

}
