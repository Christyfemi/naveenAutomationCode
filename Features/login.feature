@Smoke
Feature: feature to test login functionality
  @SmokeTest
  Scenario: Checking  successfull with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page


#  Scenario Outline: Checking is successfull with valid credentials
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login button
#    Then user is navigated to the home page
#
#    Examples:
#       |username|password|
#       |user1   |user2   |

# help me
