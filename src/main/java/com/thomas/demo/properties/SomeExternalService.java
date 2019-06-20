package com.thomas.demo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	
	//from property file
	@Value("${external.service.url}")
	private String url;

	public String ReturnServiceUrl() {
		return url;
	}



}
