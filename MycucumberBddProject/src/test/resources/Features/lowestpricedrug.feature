@Sprint1
Feature: User can find lowest drug price

  @tag1
  Scenario: To find lowest drug price
    Given User is on webmd member subscribe page
    When User click on find lowest drug prices
    And click view all drugs
    And click on "<Liptor>"
    Then user can successfully find lowest price drugs
