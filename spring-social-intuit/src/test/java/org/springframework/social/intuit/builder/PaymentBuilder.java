package org.springframework.social.intuit.builder;

import java.math.BigDecimal;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.intuit.sb.cdm.v2.IdType;
import com.intuit.sb.cdm.v2.ModificationMetaData;
import com.intuit.sb.cdm.v2.Payment;
import com.intuit.sb.cdm.v2.PaymentHeader;
import com.intuit.sb.cdm.v2.PaymentLine;

public class PaymentBuilder {

	private Payment payment;
	
	public PaymentBuilder(){
		this.payment = new Payment();
		PaymentHeader paymentHeader = new PaymentHeader();

		
		paymentHeader.setDocNumber("54");
		paymentHeader.setNote("Payment against Invoice");
		IdType customerId = new IdType();
		customerId.setValue("5");
		paymentHeader.setCustomerId(customerId);
		
		IdType depositAccountId = new IdType();
		depositAccountId.setValue("41");
		paymentHeader.setDepositToAccountId(depositAccountId);
		
		IdType paymentMethodId = new IdType();
		paymentMethodId.setValue("1");
		paymentHeader.setPaymentMethodId(paymentMethodId);
		paymentHeader.setTotalAmt(new BigDecimal("20.00"));
		paymentHeader.setProcessPayment(false);
		
		XMLGregorianCalendar txnDate = null;

		try {
			txnDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2010-08-09");
		} catch (DatatypeConfigurationException e) {
		}
		paymentHeader.setTxnDate(txnDate);		
		payment.setHeader(paymentHeader);
		
		PaymentLine paymentLine = new PaymentLine();

		paymentLine.setAmount(new BigDecimal("20.00"));
		IdType txnId = new IdType();
		txnId.setValue("8");
		paymentLine.setTxnId(txnId);
		payment.getLines().add(paymentLine);		
	}
	
	public static PaymentBuilder DefaultPayment() {
		return new PaymentBuilder();
	}
	
	public PaymentBuilder withId(Long id){
		IdType idType = new IdType();
		idType.setValue(id.toString());
		this.payment.setId(idType);
		return this;
	}

	public PaymentBuilder withSyncToken(String syncToken){
		this.payment.setSyncToken(syncToken);
		return this;		
	}

	public PaymentBuilder withMetaData(String createTimeString, String lastUpdatedTimeString){
		XMLGregorianCalendar createTime = null;
		XMLGregorianCalendar lastUpdatedTime = null;
		try {
			createTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(createTimeString);
			lastUpdatedTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(lastUpdatedTimeString);
		} catch (DatatypeConfigurationException e) {
		}
		ModificationMetaData metaData = new ModificationMetaData();
		metaData.setCreateTime(createTime);
		metaData.setLastUpdatedTime(lastUpdatedTime);
		this.payment.setMetaData(metaData);
		return this;		
	}

	public Payment build() {
		return this.payment;
	}

	public PaymentBuilder withTotalAmount(BigDecimal totalAmount) {
		PaymentHeader paymentHeader = this.payment.getHeader();
		paymentHeader.setTotalAmt(totalAmount);
		PaymentLine paymentLine = this.payment.getLines().get(0);
		paymentLine.setAmount(totalAmount);
		return this;
	}
	
}
