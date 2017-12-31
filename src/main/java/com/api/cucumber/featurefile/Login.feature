Feature: User Login Feature

  Scenario: User Login scenario
    Given User is at the login page of the application
    When User login with the following username and password
      | UserNameOne   | PasswordOne   |
      | UserNameTwo   | PasswordTwo   |
      | UserNameThree | PasswordThree |
      | UserNameFour  | PasswordFour  |
	Then User should be able to login with correct username and password