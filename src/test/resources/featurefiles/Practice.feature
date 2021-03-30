@smokeTest
Feature:Automation practice website validation

 # Scenario Outline: Create Account validation
  #  Given i launch the automation practice website
   # When  i select the "<signin>"
    #Then  i enter Valid "<email>"
    #And  i click on "<account>"

   # Examples:
    #  | signin         | email             | account            |
     # | Create Account | kisap854@gmail.com| Create An Account  |


  Scenario Outline: validate practice website for signin

    Given I Launch Practice website
    When I click on signin
    Then I enter email  "<email>"
    And I click create an account

    Examples:
    |email             |
    |kisap854@gmail.com|

    Scenario Outline: Create an Account

      When I select Title
      Then I Enter FirstName "<Fname>"
      Then I Enter LastName "<Lname>"
