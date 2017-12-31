Feature: Post feature of facebook 
	This will test the post functionality at the user wall
	
Background: Common step
	Given User should be logged in
	And should be present at its own wall
	
Scenario: Post a text on user wall
	When I type the text as "This is a sample post" in the test box
	And Click on Post button
	Then The message should get posted
	
Scenario: Post a video on user wall
	When User supply the Youtube link as "http://www.google.com" in the text box
	And Click on Post button
	Then Video should get posted on the user wall
	And The video should have proper Thumnail
