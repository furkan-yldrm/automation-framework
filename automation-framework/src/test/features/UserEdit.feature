Feature: UserEditFeature

  Scenario: Kullanıcı düzenleme

    Given Assert the url opened
    Then Click the Giris
    When Enter Admin Email and Password
      | Email | Password |
      | admin@admin.com   | admin123 |
    Then Click to the GirisYap
    Then Go to Users
    Then Click Edit
