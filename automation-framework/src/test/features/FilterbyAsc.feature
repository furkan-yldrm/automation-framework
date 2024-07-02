Feature: FilterByAscFeature

  Scenario: Fiyatı azdan çoka göre filtreleme


    Given URL Started
    Then Login to User Account
    When Eposta ve Sifre
      | Email | Password |
      | ghezzal@gmail.com | 123bjk |
    Then  Logged in
    Then Go to Products
    Then Filter by ASC
    Then Choose ASC