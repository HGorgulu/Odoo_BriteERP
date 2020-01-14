Feature:Sales
  Scenario: Verify New invoice template
    Given user is on home page
    When user enters "salesmanager40@info.com" and "salesmanager" and click Sign in button
    Then user navigates to "Sales" page
    Then user clicks on "Create" module
    Then user verifies that "New" page is displayed
    Then user adds new invoice information:
    |Customer| Expiration Date|Invoice Address|Pricelist|Delivery Address|Payment Terms|