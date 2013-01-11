package org.springframework.social.intuit.api;

import java.io.Serializable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.intuit.sb.cdm.qbo.QboUser;
import com.intuit.sb.cdm.qbo.QboUserCompanyMapping;


/**
 * Model class representing a Intuit user's profile information.
 * 
 * @author Jeffrey Williams
 */
@Root(strict=false)
public class IntuitProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name="LoginName")
	private String name;
	@Element(name="Ticket")
	private String ticket;
	@Element(name="AgentId")
	private String agentId;
	@Element(name="CurrentCompany")
	private QboUserCompanyMapping currentCompany;
	
	public IntuitProfile() {
	}

	public IntuitProfile(QboUser qboUser) {
		name = qboUser.getLoginName();
		ticket = qboUser.getTicket();
		agentId = qboUser.getAgentId();
		currentCompany = qboUser.getCurrentCompany();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTicket() {
		return ticket;
	}
	
	public String getAgentId() {
		return agentId;
	}
		
	public String getCompanyId() {
		return currentCompany.getCompanyId();
	}
	
	public String getBaseUrl() {
		return currentCompany.getBaseURI();
	}
	
	public String getSubscriptionStatus() {
//		return currentCompany.getSubscriptionStatus();
		return null;
	}
	
}
