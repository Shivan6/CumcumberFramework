Feature: Test SwagLabs application

  Background: 
    Given Open SwagLab application with url "https://www.saucedemo.com/"

  Scenario: Test for title of SWaglabs
    When User get the title of swaglab homepage title
    Then Title should matched with swaglab homepage title

  Scenario: Test for login functionality of Swaglab
    When User enter "standard_user" into username text box and "secret_sauce" into password
    And User click on swaglab login button
    Then user should able to navigate Inventory Page
