Feature: SignIn certificate service

  
  Scenario Outline: User SignIn for Certificate Service
    
    Given user is on Certificate SignIn page
    When user enters "<username>" and "<password>"
    And clicks on SignIn button
    Then homepage is displayed

    Examples: 
      | username |   password  |
      | Priya123 |   12345678  | 
      | Priya123 |   1234567   | 
      | ridan123 |   12345678@@@@  |