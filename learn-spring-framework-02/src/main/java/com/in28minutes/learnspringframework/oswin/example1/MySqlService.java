package com.in28minutes.learnspringframework.oswin.example1;

import org.springframework.stereotype.Component;

@Component
public class MySqlService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {1,2,3,4,5,999};
	}

}
