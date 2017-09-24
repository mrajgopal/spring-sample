package org.techie.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @JsonSubTypes.Type(name= "samsung", value = Samsung.class), @JsonSubTypes.Type(name= "htc",value = Htc.class)})
public class MobileCompany<T> extends Company<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4809948191835736752L;
	
	
	
	private String  simType;
	private String type;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}



	public String getSimType() {
		return simType;
	}



	public void setSimType(String simType) {
		this.simType = simType;
	}
	

}
