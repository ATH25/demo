package com.thomas.demo.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.thomas.demo.DemoBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=DemoBasicApplication.class)
public class BinarySearchXMLConfigurationTest {
	
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
//		fail("Not yet implemented");
		int actualResult = binarySearch.binarySearch(new int[]{1,2,4,3}, 3);
		assertEquals(3, actualResult);
	}

}
