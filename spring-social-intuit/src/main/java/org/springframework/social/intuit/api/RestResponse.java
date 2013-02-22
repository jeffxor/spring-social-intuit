package org.springframework.social.intuit.api;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="RestResponse",strict=false)
public class RestResponse {
	
	@ElementList(name="CompaniesMetaData")
	List<CompanyMetaData> companiesMetaData;

	public List<CompanyMetaData> getCompaniesMetaData() {
		return companiesMetaData;
	}

	public void setCompaniesMetaData(List<CompanyMetaData> companiesMetaData) {
		this.companiesMetaData = companiesMetaData;
	}
		
}
