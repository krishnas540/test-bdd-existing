@sprint
Feature: get employees info service

  Scenario: validate get all employee info
    When I make a get call to the employees service
#    Then I validate the employees info

  Scenario Outline: validate create an employee service
    When I make a post call to the create an employee service for given data "<name>", "<salary>" and "<age>"
    Examples:
    |name     |salary    |age |
    |satya    |45000     |25  |
    |sunita   |55000     |28  |
    |Ashok    |95000     |30  |


     Scenario: validate update an empolyee service
       When I make a put call to the update an empolyee service