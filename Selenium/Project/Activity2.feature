
@HRM
Feature: Get the url of the header image
  Goal: Print the url of the header image to the console

    @Activity2
   Scenario: Print the url of header image to console
    Given Browser is opened
    When User is navigated to OrangeHRM website
    Then Get the url of the header image
    And Print the url of header image to console
    And Close the browser