@All
Feature: Test Amazon apllication

  Background: 
    Given Open amazon application with url "https://www.amazon.in"

  @homepage @Regression
  Scenario: Test title of amazon home page
    When user get the title for amazon home page
    Then title should matched with amazon home page

  @bestseller @Regression @ignore
  Scenario: Test title of bestseller page
    When user click on bestseller option link
    When user get the title of bestseller page
    Then title should matched with bestsellers title

  @mobile @Regression @ignore
  Scenario: Test title of Mobiles Page
    When User click on Mobile option link
    When User get the title of mobile paage
    Then title  should matched with Mobile title
