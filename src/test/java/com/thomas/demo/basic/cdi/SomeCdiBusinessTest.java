package com.thomas.demo.basic.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.thomas.demo.DemoBasicApplication;
import com.thomas.demo.basic.BinarySearchImpl;

//@RunWith(SpringRunner.class)
@RunWith(MockitoJUnitRunner.class)
// @ContextConfiguration(classes=DemoBasicApplication.class)
public class SomeCdiBusinessTest {

	/*
	 * SomeCdiDao is the one that returns the data. So you can mock it to test
	 * different scenarios
	 */
	@Mock
	SomeCdiDao daoMock;

	/* inject mock:- The mock created in the above step will be injected here */
	@InjectMocks
	SomeCdiBusiness business;

	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 100, 2 });
		assertEquals(100, business.findTheGreatest());
	}
	
	@Test
	public void testScenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { });
		assertEquals(Integer.MIN_VALUE, business.findTheGreatest());
	}
	
	@Test
	public void testScenario_SameArrayElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
		assertEquals(2, business.findTheGreatest());
	}

}
