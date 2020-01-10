Feature: Creating an event on Calendar Module

  Background:
    Given user is on the login page
    Then user logs in as expenses manager

    Scenario: Verify WEBSITE page
      And user verifies that "WEBSITE" page subtitle is displayed

      Scenario: Verify Calendar page
        And user navigates to "WEBSITE" then to "Calendar"
        Then user verifies that "Meetings" page subtitle is displayed




    | Starting at | Duration    | Attendees  | Location      | Tags             | Reminders |
    | 01/14/2020  | 01:00 hours | Kadir,Onur | Dallas Office | Feedback Meeting | 1 Day     |



