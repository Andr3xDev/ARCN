@checkboxes
Feature: Checkboxes on The Internet
  As a user visiting the Checkboxes page on The Internet
  I want to interact with checkboxes
  So that I can verify their default state and toggle behavior

  Scenario: Checkbox 1 is unchecked by default
    Given the user is on the checkboxes page
    Then checkbox 1 should be unchecked

  Scenario: Checkbox 2 is checked by default
    Given the user is on the checkboxes page
    Then checkbox 2 should be checked

  Scenario: User can check checkbox 1
    Given the user is on the checkboxes page
    When the user checks checkbox 1
    Then checkbox 1 should be checked

  Scenario: User can uncheck checkbox 2
    Given the user is on the checkboxes page
    When the user unchecks checkbox 2
    Then checkbox 2 should be unchecked
