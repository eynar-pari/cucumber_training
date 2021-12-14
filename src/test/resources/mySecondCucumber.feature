@Regression
Feature: Authentication

  Scenario Outline: as admin user

    Given i have access to facebook
    When i set the email textbox with "<user>"
    And i set the pwd textbox with <password>
    And click in the login button
    Then i should be logged in the app

    Examples:
      | user      | password |
      | Training1 | 123      |
      | Training2 | 456      |
      | Training3 | 678      |
      | Admin1    | 0000     |
      | Admin2    | 9999     |

