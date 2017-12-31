package com.api.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/main/java/com/api/cucumber/featurefile/PostFeature.feature"},
		glue = {"com.api.cucumber.stepdfn","com.api.cucumber.hooks"},
		monochrome = true
		)
public class PostRunner {

}
