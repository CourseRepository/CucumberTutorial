package com.api.cucumber.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHooks {
	
	//1.Create the public method
	//2. Use the @Before & @After annotations with the methods
	//3. Specify the package in the runner
	//4. Inject the Scenario Object in the hook method
	
	@Before
	public void Setup(Scenario name) {
		
		System.out.println("========Before Hook===========");
		System.out.println("Name : " + name.getName());
		System.out.println("Status : " + name.getStatus());
	}
	
	@After
	public void tearDown(Scenario name){
		System.out.println("========After Hook===========");
		System.out.println("Name : " + name.getName());
		System.out.println("Status : " + name.getStatus());
	}
	
}
