@Regression
Feature: Authentication

  Scenario: As admin user
            I want to use my email and pwd
            in facebook in order to login to the app
    # this is a comment
    Given i have access to facebook
    When i set the email textbox with "training@training.com"
    And i set the pwd textbox with 123444
    And click in the login button
    Then i should be logged in the app



