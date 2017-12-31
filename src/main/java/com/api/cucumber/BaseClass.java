package com.api.cucumber;

public class BaseClass {
	
	private String featureName;
	public String getFeatureName() {
		return featureName;
	}
	public String getScenarioName() {
		return scenarioName;
	}
	private String scenarioName;
	
	public BaseClass() {
		featureName = "BDD";
		scenarioName = "DI";
	}
	
	

}
