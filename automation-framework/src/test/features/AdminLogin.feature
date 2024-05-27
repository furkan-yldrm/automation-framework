Feature: AdminLoginFeature

  Scenario: Check Admin Login with correct username and password

    And Assert the url opened
    Then Click the Giris
    When Enter Admin Email and Password
      | Email | Password |
      | admin@admin.com   | admin123 |
    Then Click to the GirisYap
    Then See the userName

