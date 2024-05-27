Feature: AdminLoginFailedFeature

  Scenario: Check Admin Login with wrong email and password

    Given Go url
    Then Click the GirisYap
    When Enter wrong Admin Email or Password
      | Email | Password |
      | admin12@admin.com   | wrongPassword |
    Then Click giris
    Then See the its not working
