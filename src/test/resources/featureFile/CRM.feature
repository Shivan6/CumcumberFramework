Feature: Test CRM application

  Background: 
    Given Open CRM application with "https://automationplayground.com/crm"

  Scenario: Test for SignIN link
    When User enters on SignIn link
    Then User should navigate to login page

  Scenario: Test for login with valid credentials
    When User navigate to login page
    When User enters valid emaildid "test@gmail.com" and valid password "test123"
    And User click on submit button
    Then User Should  able to login and navigate to customers page
