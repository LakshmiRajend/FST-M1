@HRM
Feature: Edit user information
  Goal: Edit a user’s information

    @Activity5
   Scenario Outline: Edit user information
    Given Browser is opened
    When User is navigated to OrangeHRM website
    And User provides username as "orange"
    And User provides password as "orangepassword123"
    And User clicks Login
    Then Verify HomePage is opened
    When User clicks on 'My Info' option
    And User clicks on Edit
    And user edits "<FirstName>", "<LastName>","<Gender>","<Nationality>","<DOB>"and clicks Save
    Then Verify user info is saved 
    And  Close the browser
    
    Examples:
    |FirstName   |LastName   |Gender  | Nationality | DOB       |
    |Jeevan      |Kishore    |Male    | Indian      | 1992-02-03|
    
    
    