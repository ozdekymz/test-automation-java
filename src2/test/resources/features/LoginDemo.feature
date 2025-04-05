Feature: Sample login functionality
  @login
  Scenario: User logs in with valid credentials

    Given browser is open
    And user is on login page
    When user enters valid username
    And user enters valid password
    And clicks on login button
    Then user is navigated to the home page
