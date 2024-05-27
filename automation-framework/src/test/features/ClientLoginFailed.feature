Feature: ClientLoginFailedFeature

  Scenario: Check Client Login with wrong email and password

    Given Go site
    Then Click  Giris
    When Enter wrong  Email or Password
      | Email | Password |
      | ghezzal@gmail.com   | wrongPassword |
    Then  Try to Login
    Then See the error
