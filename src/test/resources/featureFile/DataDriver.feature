Feature: Test Hrm for datadriven

  Scenario Outline: Test Orangehrm for multiple datasets
    Given Open enters Username and enters password
    When user enters"<username>" and enters "<password>"
    And User click on login button
    Then As per valid data set user should be navigated to dashboard

    Examples: 
      | Username | password |
      | Admin    | admin123 |
      | kiran    | test123  |
      | Admin    | admin123 |
      | smita    | test123  |
