package com.in28minutes.learnspringframework.oswin.example1;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
	int[] retrieveData();
}
