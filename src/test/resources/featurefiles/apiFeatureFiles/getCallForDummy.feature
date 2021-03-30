Feature: Dummy sites api validation

  Scenario Outline: Validate the dummy get employee information
    When I make a get call to the dummy employees service "<id>", <statusCode>, "<acceptanceCriteria>"
    Then I validate the employees info for dummy
  Examples:
  |id |statusCode |acceptanceCriteria |
  |1  |200        |Tiger Nixon        |
#  |2  |200        |Garrett Winters    |

#  Scenario: Validate the dummy post employee information
#    When I make a post call to the dummy employees service
#    Then I validate the employees info for dummy post service

#  Scenario: Validate the dummy put employee information
#    When I make a put call to the dummy employees service
#    Then I validate the employees info for dummy put service
