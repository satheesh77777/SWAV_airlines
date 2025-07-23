Feature: HHKUHKJL

#@Test
  Scenario Outline: Successful login with valid credentials
    Given User navigates to Flipkart homepage
    When User clicks on the sign-in button
    Then User enters "<mobileNumber>"mobile number in the mobile number field
    And User clicks on requestOTP button
    Then User clicks on verify button
    And User enters the OTP received on the mobile number
    Then User should be logged in successfully good morning adn have a nice day


    Examples:
      | mobileNumber       |
      | 9113672922         |
