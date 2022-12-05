# create new feature file  named navigateMenuWithParameter
     # Class Task
  # login as a teacher
  # verify welcome message
  # go to developer page
  # verify "Filter Profiles by Skill or by Location"

  # login as a student
  # verify welcome message
  # go to Post page
  # verify "Post"

    # login as a developer
  # verify welcome message
  # go to Dashboard page
  # verify "Dashboard"

  @NavigateWithParameter
Feature:Navigation Menu as a different user

  Scenario: Log in as a teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"
    And The user navigates to Developers menu
    Then The users able to see developer text

  Scenario: Log in as a student with parameters
    Given The user is on the login page
    When The user logs in using "EurotechB5@gmail.com" and "Test12345"
    Then The user should be able to login
    And The welcome message contains "eurotechB5"
    And The user navigates to My Account  menu
    And The user navigates to "My Posts" page
    Then The users able to see Posts text

  Scenario: Log in as a developer with parameters
    Given The user is on the login page
    When The user logs in using "student33@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Denis"
    And The user navigates to My Account  menu
    And The user navigates to "Dashboard" page
    Then The users able to see dashboard text
