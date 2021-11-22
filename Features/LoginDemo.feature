Feature: Test Login functionality
  @SmokeScenario
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open there
    And user is on login page site
    When user enters <username> and <password> details
    And user clicks on login
    Then user is navigated to the home page site

    Examples:
    |username|    password|
    |olufemi |     12345   |
    |Eze     |     12345   |