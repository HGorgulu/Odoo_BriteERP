Feature:Sales
  Scenario: Verify New invoice template
    Given user is on home page
    When user enters "salesmanager40@info.com" and "salesmanager" and click Sign in button
    Then user navigates to "Sales" page then user clicks "Create" module
    Then user verifies that new invoice template is displayed