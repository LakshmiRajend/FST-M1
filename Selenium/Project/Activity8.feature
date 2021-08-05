@HRM
Feature: Applying for a leave
  Goal: Login and apply for a leave on the HRM site

    @Activity8
   Scenario Outline: Applying for a leave
    Given Browser is opened
    When User is navigated to OrangeHRM website
    And User provides username as "orange"
    And User provides password as "orangepassword123"
    And User clicks Login
    Then Verify HomePage is opened
    When User Navigates to Dashboard
    And User Clicks Apply Leave option
    And User selects Leave Type,"<From Date>","<To Date>" and Clicks Apply
   When User navigates to My Leave page 
    And User searches with "<From Date>","<To Date>" and clicks Search
   Then Check status of application 
    And  Close the browser
    
        Examples:
    |From Date         |To Date      |
    |2021-09-13        | 2021-09-17  |

    
    
    