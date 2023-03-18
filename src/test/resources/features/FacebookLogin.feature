Feature: Validation of Login page in facebook web application

  Background: 
    Given User launch Facebook Web Application

  Scenario: TC01_Validation of login page with valid username and valid password
    When User enters valid username and valid password
    And User clicks login Button
    Then User verify Home Page is displayed

  Scenario Outline: TC02_Validation of login page with multiple invalid credentials
    When User enters invalid "<username>" and invalid "<password>"
    And User clicks login Button
    Then User verify error message is displayed

    Examples: 
      | username  | password |
      | greens    |    12234 |
      | vinothraj |   735438 |
      | grace     |   745490 |
