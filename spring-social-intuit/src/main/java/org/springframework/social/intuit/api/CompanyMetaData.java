package org.springframework.social.intuit.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 *			<CompanyMetaData>
 *				<ExternalRealmId>318415425</ExternalRealmId>
 *				<QBNRegisteredCompanyName>ASP National Testing School</QBNRegisteredCompanyName>
 *				<SampleFile>false</SampleFile>
 *				<QBNCompanyUserAdminIdNumber>200137774</QBNCompanyUserAdminIdNumber>
 *				<QBNCompanyUserAdminEmail>jeffxor.williams@gmail.com</QBNCompanyUserAdminEmail>
 *				<SyncEnabled>false</SyncEnabled> 
 *				<CustomField xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"xsi:type="StringTypeCustomField">
 *					<DefinitionId idDomain="NG">DoNotUse</DefinitionId>
 *					<Name>RealmStatus</Name>
 *					<Value>NonIDS</Value>
 *				</CustomField> 
 *			</CompanyMetaData>
 * 
 * @author williamj
 * 
 */
@Root(strict=false)
public class CompanyMetaData {
	
	@Element(name="ExternalRealmId")
	private String companyId;
	@Element(name="QBNRegisteredCompanyName")
	private String companyName;
	@Element(name="SampleFile")
	private Boolean sampleFile;
	@Element(name="QBNCompanyUserAdminIdNumber")
	private String adminUserId;
	@Element(name="QBNCompanyUserAdminEmail")
	private String adminUserEmail;	
	@Element(name="SyncEnabled")
	private Boolean syncEnabled;
	
	public String getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public Boolean getSampleFile() {
		return sampleFile;
	}
	
	public void setSampleFile(Boolean sampleFile) {
		this.sampleFile = sampleFile;
	}
	
	public String getAdminUserId() {
		return adminUserId;
	}
	
	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}
	
	public String getAdminUserEmail() {
		return adminUserEmail;
	}
	
	public void setAdminUserEmail(String adminUserEmail) {
		this.adminUserEmail = adminUserEmail;
	}
	
	public Boolean getSyncEnabled() {
		return syncEnabled;
	}
	
	public void setSyncEnabled(Boolean syncEnabled) {
		this.syncEnabled = syncEnabled;
	}

}
