package org.springframework.social.intuit.api;

import java.util.List;

import com.intuit.sb.cdm.v2.PaymentMethod;


public interface PaymentMethodOperations {
	
	public PaymentMethod getPaymentMethod(Long id);
	public List<PaymentMethod> getPaymentMethods();
}
