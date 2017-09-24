package org.techie.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


public class Company<T> implements Serializable {

	private static final long serialVersionUID = -8869676577723436716L;

	private T info;
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}


}


