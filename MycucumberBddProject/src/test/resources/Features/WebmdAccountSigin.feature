@Sprint1
Feature: User can sign in his webMed account

  @tag1
  Scenario: I can sign in my account using valid email and password
    Given I am in webmd rx page
    When click on My Account
    And I enter my email"<warroirsdragon@gmail.com>"
    And I enter my password"<Talentech123456>"
    And I click on sign in button
    Then I can successfully sign in to my webmd account
