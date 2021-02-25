@regression
Feature: greyhound website validation

  Background: launch the application
    Given I launch the greyhound website

  Scenario: validate greyhound website book a trip
    When I click on the book a trip
    And I click on the booknow
    Then I validate the booking template
    And I close the browser successfully

