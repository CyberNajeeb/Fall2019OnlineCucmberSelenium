@login
Feature: Login
  As user, I want to be able to login with username and password
# Agile story

# Test Method = Test Case = Scenario
# Test + DataProvider = Scenario Outline + Example table

  Background: open login page
    Given user is on the login page

  @sales_manager
  Scenario: Login as sales manager and verify that title is Dashboard

    When user logs in as a sales manager
    Then user should verify that title is a Dashboard

  @store_manager
  Scenario: Login as store manager and verify that title is Dashboard
    When user logs in as a store manager
    Then user should verify that title is a Dashboard

  @driver @dashboard
  Scenario: Login as driver and verify that title is Dashboard
    When user logs in as a driver
    Then user should verify that title is a Dashboard

  Scenario: login with parameters

    When user enters "storemanager85" username and "UserUser123" password
    Then user should verify that title is a Dashboard

  @scenario_outline
  Scenario Outline: user name test for user <name>

    When user logs in as with "<username>" username and "<password>" password
    Then user should be "<name>"
    Examples:
      | username        | password    | name              |
      | user187         | UserUser123 | Elenor Kreiger    |
      | user200         | UserUser123 | Meggie Macejkovic |
      | storemanager52  | UserUser123 | Roma Medhurst     |
      | storemanager66  | UserUser123 | Albin Lemke       |
      | salesmanager125 | UserUser123 | Deion Fadel       |
      | salesmanager140 | UserUser123 | Matteo Hegmann    |
