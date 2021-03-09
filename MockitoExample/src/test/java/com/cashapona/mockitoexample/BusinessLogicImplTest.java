package com.cashapona.mockitoexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BusinessLogicImplTest {

	@Test
	void findGreatestNumber() {
		SomeBusinessLogic s=new SomeBusinessLogic(new DataServiceStub());
		int result=s.findGreatestFromAllTheData();
		assertEquals(100, result);
		System.out.println(result);
	}

}
class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {20,10,40,100};
	}
	
}