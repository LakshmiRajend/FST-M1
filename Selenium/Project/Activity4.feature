@HRM
Feature: Add a new employee
  Goal: Add an employee and their details to the site

    @Activity4
   Scenario Outline: Add a new employee
    Given Browser is opened
    When User is navigated to OrangeHRM website
    And User provides username as "orange"
    And User provides password as "orangepassword123"
    And User clicks Login
    Then Verify HomePage is opened
    When User clicks on PIM option
    And User clicks on Add
    And user provides "<FirstName>", "<LastName>" and clicks Save
    Then Verify Employee is added
    When User navigates to Employee List tab in PIM page
    And Searches for employee created using "<FirstName>", "<LastName>"
    Then Employee Creation is verified
    And  Close the browser
    
    Examples:
    |FirstName   |LastName   |
    |Seetha      |Manu       |
    #|Meera       |Vasudev    |
    
    