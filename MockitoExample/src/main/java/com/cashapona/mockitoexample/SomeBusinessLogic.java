package com.cashapona.mockitoexample;

public class SomeBusinessLogic {
	private DataService dataService;
	
	public SomeBusinessLogic(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findGreatestFromAllTheData() {
		int[] data = dataService.retriveAllData();

		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}

		}
		return greatest;
	}

}
