@Sprint1
Feature: I can subscribe webmd newsletter

  Scenario: I can subscribe webmd newsletter successfully
    Given I am in webmd homepage
    When I enter my email to webmd newsletter box
    And click on subscribe button
    Then I can succesfully subscribe webmd newsletter
