Feature: Login functionality

  @login
  Scenario: User logs in with valid credentials
    Given The user is on the login page
    When The user enters valid username
    And The user enters valid password
    And The user clicks on the login button
    Then The user should be redirected to the landing page

