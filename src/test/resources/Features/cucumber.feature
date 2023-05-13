Feature: verifing the login functionality of the OrangeHRM

  Scenario: verify login with valid credentials
    Given user launch the url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enters the username as "Admin"
    And user enters the password as "admin123"
    And user clicks the login
    Then user lands the homepage succesfully
