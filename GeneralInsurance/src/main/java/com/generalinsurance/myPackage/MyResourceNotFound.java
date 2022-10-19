package com.generalinsurance.myPackage;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyResourceNotFound extends RuntimeException  {
	
private static final long serialVersionUID = 1L;
	
	private @Getter String resourceName;
	private @Getter String fieldName;
	private @Getter Object fieldValue;
	
	public MyResourceNotFound(String resourceName, String fieldName, Object fieldValue) {
		super(resourceName+" not found with "+fieldName+" : "+fieldValue);
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	
	

}
