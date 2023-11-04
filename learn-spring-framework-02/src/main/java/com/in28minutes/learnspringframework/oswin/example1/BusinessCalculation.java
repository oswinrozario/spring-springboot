package com.in28minutes.learnspringframework.oswin.example1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculation {
	
	private DataService dataService;

	//first letter small, then camel case for QUALIFIER
	public BusinessCalculation(@Qualifier("mySqlService")  DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		int ans = Integer.MIN_VALUE;
		for(int item : dataService.retrieveData()) {
			ans = Math.max(ans, item);
		}
		return ans;
	}
	
}