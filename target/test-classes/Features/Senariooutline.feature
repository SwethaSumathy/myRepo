
Feature: verifing the login functionality of the OrangeHRM


    Scenario: login with valid credentials
     Given user launches  url
       When user enters  username as "<u>"  
    And user enters  password as "<p>"
    And user clicks the login button
    Then user launch the homepage 
    
    Examples: 
      | u                          | p         |
      | swetha12@gmail.com         |Swe@123    | 
      | priyadharshini34@gmail.com |dharshu@123|
      | oranum@gmail.com           |pass@123   |
      | selenium@gmail.com         |src@34     |