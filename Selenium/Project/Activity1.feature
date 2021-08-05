@HRM
Feature: Verify the website URL
  Goal: Read the title of the website and verify the text
@Activity1
 Scenario: Navigate to OrangeHRM website and verify the title
    Given Browser is opened
    When User is navigated to OrangeHRM website
    And User gets the page title
    Then Verify title of the page is "OrangeHRM"
    And Close the browser

    
    
 

