@regression
Feature: greyhound website validation

  Background: launch the application
    Given I launch the greyhound website

#  Scenario: validate greyhound website book a trip
#    When I click on the book a trip
#    And I click on the booknow
#    Then I validate the booking template
#    And I close the browser successfully

    Scenario Outline: validate greyhound login functionality
      When i enter user name "<userName>"
      And i Enter password "<password>"
      Then click on the Go
      And i validate the login "<status>"
      Examples:
      |userName                 |password |status                                                                 |
      |gosusatya@gmail.com      |abcd     |Sorry, your login was not successful. Check and try again.             |
      |krishna@gmail.com        |abcd     |Sorry, your login was not successful. Check and try again.             |
      |krishnaSunny@gmail.com   |abcd     |Sorry, your login was not successful. Check and try again.             |

    Scenario Outline: Validate trip
      When i enter from "<from>"
      And i enter to "<to>"
      Then Enter Depart on Date "<ddate>"
      And Enter return date "<rdate>"
      Then i click on search
      And I validate trip details "<message>"
      Examples:
      |from           |to                |ddate        |rdate      |message                  |
      |New York, NY   |Fayetteville, AR  |02/26/2021   |03/28/2021 |Choose your outgoing trip|