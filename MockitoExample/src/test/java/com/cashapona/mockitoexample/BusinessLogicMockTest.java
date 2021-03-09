package com.cashapona.mockitoexample;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class BusinessLogicMockTest {

	
	@Test
	void testTheGreatestFromData() {
		
		DataService dataServiceMock=mock(DataService.class);
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {10,30,20,100});
		SomeBusinessLogic s=new SomeBusinessLogic(new DataServiceStub());
		int result=s.findGreatestFromAllTheData();
		assertEquals(100, result);
		System.out.println(result);
	}

}
