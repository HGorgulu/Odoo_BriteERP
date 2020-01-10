Feature: Login
  @Odoo
  Scenario: User should be able to login with valid credential
    Given user is on home page
    When user enters "salesmanager40@info.com" and "salesmanager" and click Sign in button
    Then user should be on "#inbox" page
    And close browser

  Scenario: User should not able to login with invalid credential
    Given user is on home page
    When user enters "wrong" and "wrong" and click Sign in button
    Then user should not be able to login
    And error message should be displayed
    And close browser