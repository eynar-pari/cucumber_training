@Regression
Feature: login

  Scenario: register

    Given i have access to Facebook
    When fill the form with the map values
      | Name   | Test            |
      | Phone  | 787987564       |
      | DNI    | 123123          |
      | Email  | eynar@eynar.com |
      | Adress | Adrress 55555   |
      | Phone2 | 78946512        |
    And click on the register button
    Then i should be registered
