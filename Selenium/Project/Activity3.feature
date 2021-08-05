@HRM
Feature: Logging into the site
  Goal: Open the site and login with the credentials provided

    @Activity3
   Scenario: Logging into the site
    Given Browser is opened
    When User is navigated to OrangeHRM website
    And User provides username as "orange"
    And User provides password as "orangepassword123"
    And User clicks Login
    Then Verify HomePage is opened
    And  Close the browser