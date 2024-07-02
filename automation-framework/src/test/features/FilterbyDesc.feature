Feature: FilterByDescFeature

  Scenario: Fiyatı çoktan aza göre filtreleme


    Given URL Starts
    Then Login to User
    When Eposta Sifre
      | Email | Password |
      | ghezzal@gmail.com | 123bjk |
    Then  Logged into
    Then Go to the Products
    Then Filter by DESC
    Then Choose DESC