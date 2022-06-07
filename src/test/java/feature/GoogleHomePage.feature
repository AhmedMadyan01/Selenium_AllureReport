@Sanity
Feature: Google home page

  @GoogleTest
  Scenario: Validate google logo icon displayed in google home page
    Given User navigates to google URL
    When User successfully navigated
    Then User should see google logo icon displayed