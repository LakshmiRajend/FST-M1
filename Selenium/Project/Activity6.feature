@HRM
Feature: Verify that the “Directory” menu item is visible and clickable
  Goal: Verify that the “Directory” menu item is visible and clickable

    @Activity6
   Scenario: Verify that the “Directory” menu item is visible and clickable
    Given Browser is opened
    When User is navigated to OrangeHRM website
    And User provides username as "orange"
    And User provides password as "orangepassword123"
    And User clicks Login
    And User Locates the navigation menu
    Then Verify Directory menu item is visible and clickable
    And Click 'Directory' menu
    And Verify that the heading of the page
    And  Close the browser

    
    
    