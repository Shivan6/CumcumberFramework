@All
Feature: Test Opencart application
@Register @Regression
  Scenario: Test the Registration process for new user
    Given Open Register page with url "https://tutorialsninja.com/demo/index.php?route=account/register"
    When user enters required entries
      | fname  | lname | emailId          | tele       | pwd     | cpwd    |
      | Shivan | Ali   | shivan@gamil.com | 7000132478 | test123 | test123 |
    When user click one yes Newsletter
    When User check the privacy policy option
    When user click on continue button
    Then user should be able to register
@Login @Regression
  Scenario: Test the login functionally for register
    Given Open application with url "https://tutorialsninja.com/demo/index.php?route=account/login"
    When User enters credentials
      | email            | pwd     |
      | shivan@gamil.com | test123 |
    When user click on cart login button
    Then user should able to Login application
