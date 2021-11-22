Feature: feature to test Google search functionality
  Scenario: Validate google search is working
    Given  browser is open
    And user is on google page
    When  user enters a text in search box
    And clicks submit button
    Then  user is navigated to search results