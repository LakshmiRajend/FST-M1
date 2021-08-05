@HRM
Feature: Retrieve emergency contacts
  Goal: Login and retrieve the emergency contacts for the user

    @Activity9
   Scenario: Applying for a leave
    Given Browser is opened
    When User is navigated to OrangeHRM website
    And User provides username as "orange"
    And User provides password as "orangepassword123"
    And User clicks Login
    Then Verify HomePage is opened
    When User clicks on 'My Info' option
    And User clicks on Emergency Contacts
    And User Retrieve information about all the contacts listed in the table and print to console
    Then Close the browser
  

    
    
    