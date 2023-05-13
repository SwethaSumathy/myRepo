Feature: verifying the login functionality of OrangeHRM

  Background: 
    Given the user launches url

  Scenario: login with valid credentials
    When the user enters the username as "Admin"
    And the user enters the password as "admin123"
    And the user click the login
    Then user successfully login the homepage

  @Regression
  Scenario Outline: login with Invalid credentials
    When the user enters the username as "<ur>"
    And the user enters the password as "<pwd>"
    And the user click the login
    Then user successfully login the homepage

    Examples: 
      | ur               | pwd      |
      | swe@gmail.com    |     1234 |
      | reetha@gmail.com |      349 |
      | Admin            | admin123 |
