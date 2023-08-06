@Vosita
Feature: Patient Journey

  @Registration_Flow
  Scenario: Validate user is able to register with valid data
    Given User navigates to Vosita URL
    When User successfully navigated
    Then User should see the home page loaded
    When User navigates to the registration page and registers with valid data
    Then User should receive a verification e-mail
    When User Verify the registration
    Then User should get a registration success message

  @Booking_Flow
  Scenario: Validate user is able to book [office and virtual] visit appointment
    Given Registered user navigates to Vosita URL
    When User searches for a provider name
    Then User should see a list of providers with their availabilities
    When User selects an availability
    Then User should be navigated to the booking page
    When User books the appointments
    Then User should get a success message
    And User should be redirected to his list of appointments waiting for provider confirmation
    Then User should get an email from the provider confirming the appointment