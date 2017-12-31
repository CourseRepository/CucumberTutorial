package com.api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"src/main/java/com/api/cucumber/featurefile/Login.feature",
				"src/main/java/com/api/cucumber/featurefile/PostFeature.feature"},
		glue = {"com.api.cucumber.stepdfn"},
		monochrome = true
		)

public class PostTestNgRunner extends AbstractTestNGCucumberTests {

}
