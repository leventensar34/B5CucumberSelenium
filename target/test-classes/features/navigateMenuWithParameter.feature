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

  @wip3
Feature:Navigation to Menu with Parameters

  Background:
    Given The user is on the login page

  Scenario: User navigates to Developers Menu
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"
    And The user navigates to "Developers" menu
    Then The users should able to see header as "Filter Profiles by Skill or by Location"

  Scenario: User navigates to All Post Menu
    When The user logs in using "EurotechB5@gmail.com" and "Test12345"
    Then The user should be able to login
    And The welcome message contains "eurotechB5"
    And The user navigates to "All Posts" menu
    Then The users should able to see header as "Posts"

  Scenario: User navigates to My Account Menu
    When The user logs in using "student33@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Denis"
    And The user navigates to "My Account" menu
    Then The users should able to see header as "Dashboard"
