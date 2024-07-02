Feature: AddToCartFeature

  Scenario: Sepete Ekleme


    Given Open site
    Then Login account
    When User info
      | Email | Password |
      | ghezzal@gmail.com | 123bjk |
    Then Login Attempt
    Then Urunler page
    Then Add ToCart
    Then Go to CartPage