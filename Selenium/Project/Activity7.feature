@HRM
Feature: Adding qualifications
  Goal: Add employee qualifications

    @Activity7
   Scenario Outline: Adding qualifications
    Given Browser is opened
    When User is navigated to OrangeHRM website
    And User provides username as "orange"
    And User provides password as "orangepassword123"
    And User clicks Login
    Then Verify HomePage is opened
    When User clicks on 'My Info' option
    And User clicks on 'Qualification' option
    And User adds Work Experience giving "<Company>", "<Job Title>", "<From>","<To>","<Comment>" and click Save
    And  Close the browser
    
        Examples:
    |Company     |Job Title     |From      | To              | Comment           |
    |TCS         |IT Analyst    |2014-09-25| 2020-09-09      | 	Automation Tester|

    
    
    