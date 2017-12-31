package com.api.cucumber.stepdfn;

import com.api.cucumber.BaseClass;
import com.api.cucumber.transform.TransformData;

import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostStepDfn {
	
		//1. To create a reference variable in the dependent class
		//2. To initialize the reference variable via cons
	
		private BaseClass baseClass;
		
		public PostStepDfn(BaseClass baseClass) {
			this.baseClass = baseClass;
		}
	
	
		@Given("^User should be logged in$")
	    public void user_should_be_logged_in() throws Throwable {
	        System.out.println("Given User should be logged in ==> " + baseClass.getFeatureName());
	        System.out.println("Given User should be logged in ==> " + baseClass.getScenarioName());
	    }

	    @When("^I type the text in the test box$")
	    public void i_type_the_text_in_the_test_box() throws Throwable {
	        System.out.println("When I type the text in the test box");
	    }

	    @When("^User supply the Youtube link in the text box$")
	    public void user_supply_the_youtube_link_in_the_text_box() throws Throwable {
	    	System.out.println("When User supply the Youtube link in the text box$" );
	    }

	    @Then("^The message should get posted$")
	    public void the_message_should_get_posted() throws Throwable {
	    	System.out.println("Then The message should get posted");
	    }

	    @Then("^Video should get posted on the user wall$")
	    public void video_should_get_posted_on_the_user_wall() throws Throwable {
	    	System.out.println("Then Video should get posted on the user wall");
	    }

	    @And("^should be present at its own wall$")
	    public void should_be_present_at_its_own_wall() throws Throwable {
	        System.out.println("And should be present at its own wall");
	    }

	    @And("^Click on Post button$")
	    public void click_on_post_button() throws Throwable {
	        System.out.println("And Click on Post button");
	    }

	    @And("^The video should have proper Thumnail$")
	    public void the_video_should_have_proper_thumnail() throws Throwable {
	    	System.out.println("And The video should have proper Thumnail");
	    }
	    
	    @When("^I type the text as \"([^\"]*)\" in the test box$")
	    public void i_type_the_text_as_something_in_the_test_box(String strArg1) throws Throwable {
	       System.err.println("Value : " + strArg1);
	    }
	    
	    @When("^User supply the Youtube link as \"([^\"]*)\" in the text box$")
	    public void user_supply_the_youtube_link_as_something_in_the_text_box(@Transform(TransformData.class)String strArg1) throws Throwable {
	    	 System.err.println("Value : " + strArg1 + 1/0);
	    }

}
