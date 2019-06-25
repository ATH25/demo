package com.thomas.demo.basic.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named //@Component
public class SomeCdiDao { 
	
	public int[] getData(){
		return new int[]{1,2,3,4};
	}
}


