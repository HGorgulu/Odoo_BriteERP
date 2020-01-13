@crm_main_page
  Feature: CRM module is clickable

    @crm_title @smoke_test
      Scenario: User should be able to click CRM module
      Given user is on the login page
      And user enters valid username and password
      Then user clicks at log in button
      Then user should click at CRM module
      And user verify that page title is ""Pipeline - Odoo"