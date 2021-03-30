Feature:Delect Employee servive validation


  Scenario Outline:Validate Delete Employee Service
    When i make a delete call to theDelete Employee service <employeeID>
    Then I validate the response "<status>"
    Examples:
    |employeeID   |status                           |
    |21           |Error! Not able to delete record |
    |1            |successfully! deleted Records    |
    |3            |Error! Not able to delete record |