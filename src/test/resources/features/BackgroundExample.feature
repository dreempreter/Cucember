@background
Feature: Background Example

Background:
 Given Precondition1
    And Precondition2
    
    @Smoke @sprint5
  Scenario: Example1
    When Test step nr1 firstName is "Murad" and lastName is "Bayramov"
    And Test step nr2
    And Test step nr3 age is 30
    Then Validation nr1
    Then Validation nr2

  Scenario: Example2
    When Test Step nr4
    And Test Step nr5
    And Test Step nr6
    Then Validation nr3
    And Validation nr4
