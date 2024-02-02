package com.project.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class resourceNotFound extends RuntimeException{
    
	String resourceName;
	String fieldName;
	int fieldValue;
	
	public resourceNotFound(String resourceName, String fieldName,int fieldValue) {
		super(String.format("%s not found with %s : %s",resourceName, fieldName,  fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
}
