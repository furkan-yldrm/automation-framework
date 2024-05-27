Feature: ClientLoginFeature

  Scenario: Check Login with correct username and password


    And Assert url opened
    Then Click the login
    When Enter Client Email and Password
      | Email | Password |
      | ghezzal@gmail.com | 123bjk |
    Then  Click the login button
    Then See the username