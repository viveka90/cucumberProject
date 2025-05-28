Feature: User login

  Scenario: User is able to login with valid credentials

    Given user enters valid user name in the email field
    And user enters valid password in the password field
    When user click on the login button
    Then user is logged in successfully

  Scenario: user not able to login with Invalid credentials
    Given user enters invalid UserName in the email field
    And user enters invalid Password in the password field
    When user click on the login button
    Then user login failed and Error message is displayed
