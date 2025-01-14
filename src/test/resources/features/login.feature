Feature: SauceDemo Login

  Scenario: Successful login
    Given I am on the SauceDemo login page
    When I enter valid credentials
    And I click the login button
    Then I should be redirected to the products page