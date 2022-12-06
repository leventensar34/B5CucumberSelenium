Feature: Dashboard Page Menu

  Background:
    Given The user is on the login page
@wip
  Scenario: User should be able to see Dashboard Menu after log in
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |

  @wip
  Scenario: Log in as a specific user
    When The user logs in using following credentials
      | username | eurotech@gmail.com |
      | password | Test12345!         |
      | message  | Teacher            |
    Then The user should be able to login
    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |