@NavigationMenu
Feature: Navigation Menu

  @developer
  Scenario: Navigation to Developers menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to sees welcome message
    And The user navigates to Developers menu
    Then The users able to see developer text

  Scenario: Navigation to All Post menu
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to sees welcome message
    And The user navigates to All Post menu
    Then The users able to see Posts text

  @wip
  Scenario: Navigation to My Account Menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to sees welcome message
    And The user navigates to My Account  menu
    Then The users able to see dashboard text