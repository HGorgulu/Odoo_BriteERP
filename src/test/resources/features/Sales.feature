Feature:Sales
  Scenario: Verify New invoice template
    Given user is on home page
    When user enters "salesmanager40@info.com" and "salesmanager" and click Sign in button
    Then user should be on "#inbox" page
    Then user is on Sales page and "Quotations" title is displayed
    Then user verifies that column names are displayed
      | Quotation Number  |
      | Quotation Date    |
      | Customer          |
      | Salesperson       |
      | Total             |
      | Status            |
    Then user clicks on "Create" module
    Then user verifies that "New" page is displayed
