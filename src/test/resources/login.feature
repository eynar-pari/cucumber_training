Feature:  Login
  @Selenium
  Scenario: Login

    Given open the todo.ly
    When I set my credentials
       |user |test78@test78.com|
       |pwd  |12345ssssss |
    Then i should be logged in the page