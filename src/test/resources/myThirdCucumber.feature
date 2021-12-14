@Regression
Feature: Auth

  Background: testt
    Given i have access to facebook

  Scenario: test1
    When i set the email textbox with "training@training.com"
    And i set the pwd textbox with 123444
    And click in the login button
    Then i should be logged in the app

  Scenario: test2
    When i set the email textbox with "training@training.com"
    And click in the login button
    Then i should be logged in the app

  Scenario: test3
    And i set the pwd textbox with 123444
    And click in the login button
    Then i should be logged in the app