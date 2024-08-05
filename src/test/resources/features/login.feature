Feature: User Authentication

  Scenario: Successful login
    Given the user is on the login pages
    When the user enters a valid username and password
    Then the user is redirected to the homepage
