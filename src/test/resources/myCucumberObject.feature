Feature: login


  @SmokeTest @Regression
  Scenario: register

    Given i have access to Facebook
    When fill the form with the object values
      | Name | Phone     | DNI    | Email           | Adress        | Phone2   |
      | Test | 787987564 | 123123 | eynar@eynar.com | Adrress 55555 | 78946512 |
    And click on the register button
    Then i should be registered