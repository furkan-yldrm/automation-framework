Feature: FilterByCategoryFeature

  Scenario: Kategoriye göre filtreleme


    Given Open
    Then Loginnn
    When Email and Passwordd
      | Email | Password |
      | ghezzal@gmail.com | 123bjk |
    Then  Go Login
    Then Urunler
    Then Filter by Category
    Then Choose Bilgisayar