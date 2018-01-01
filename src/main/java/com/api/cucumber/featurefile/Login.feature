Feature: User Login Feature

  Scenario: User Login scenario
    Given User is at the login page of the application
    When User login with the following username and password
      | UserNameOne   | PasswordOne   |
      | UserNameTwo   | PasswordTwo   |
      | UserNameThree | PasswordThree |
      | UserNameFour  | PasswordFour  |
	Then User should be able to login with correct username and password
	
Scenario Outline: scenario description
	Given a precondition has value "<param_1>"
		And something with "<param_2>"
		Then check "<param_3>" is the output
		
		Examples:
		| param_1 | param_2 | param_3 |
		| value1_1 | value1_2 | value1_3 |
		| value2_1 | value2_2 | value2_3 |
		| value3_1 | value3_2 | value3_3 |