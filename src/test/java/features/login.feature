Feature: User login

  @smoke
  Scenario: User is able to login with valid credentials

    Given user enters valid user name in the email field
    And user enters valid password in the password field
    When user click on the login button
    Then user is logged in successfully

   @smoke
  Scenario Outline: user not able to login with Invalid credentials
    Given user enters invalid email "<email>" in the email field
    And user enters invalid password "<password>" in the password field
    When user click on the login button
    Then user login failed and warning message "<errorMessage>" is displayed
    Examples:
      | email               |password       | errorMessage        |
      | text1@gmail.com     | test@123     | Warning: No match for E-Mail Address and/or Password.|
      | text2@gmail.com      | test@123     | Warning: No match for E-Mail Address and/or Password.|
      | text3@gmail.com      | test@123     | Warning: No match for E-Mail Address and/or Password.|
