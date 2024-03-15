Feature: LoginFeature

  Scenario: Check Login with correct username and password


    And Assert url opened
    Then Click the login
    When Enter UserName and Password
      | UserName | Password |
      | admin    | password |
    Then  Click the login button
    Then See the username and hello