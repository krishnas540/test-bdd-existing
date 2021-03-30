@smoketest @e2e
Feature: Amazon website validation

#    Scenario Outline: Amazon fresh validation
#      Given i launch the amazon website
#      When i select the "<department>" from the search dropdown
#      Then  i enter the product "<productName>"
#      And i validate the product price
#      And I mouse hover on rating and see the graph
#      Examples:
#      |department         |productName |
#      |Amazon Fresh       |onion

  Scenario Outline: Amazon fresh validation
    Given i launch the amazon website
   When i select the "<department>" from the search dropdown
    Then  i enter the product "<productName>"
    And I select the brand "<brandName>", "<brandName2>"
    #And I navigate to gmail website
    Examples:
      | department   | productName | brandName   | brandName2   |
      | Amazon Fresh | onion       | McCormick   | Philadelphia |
#      | Amazon Fresh | onion       | Happy Belly | Birds Eye    |

  Scenario: New Hampshire liquor Validation
    Given I lauch the the liquor website
    When I