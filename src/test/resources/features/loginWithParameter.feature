Feature: Log in as different user
  @wip
  Scenario: Log in as a teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"

  Scenario: Log in as a student with parameters
    Given The user is on the login page
    When The user logs in using "EurotechB5@gmail.com" and "Test12345"
    Then The user should be able to login
    And The welcome message contains "eurotechB5"

    # developer
  @wip2
  Scenario: Log in as a student with parameters
    Given The user is on the login page
    When The user logs in using "student33@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Denis"

