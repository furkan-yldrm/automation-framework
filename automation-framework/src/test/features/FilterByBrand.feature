Feature: FilterByBrandFeature

  Scenario: Markaya göre filtreleme


    Given opened
    Then loginn
    When Email and Password
      | Email | Password |
      | ghezzal@gmail.com | 123bjk |
    Then  Click the login buton
    Then Go to Urunler
    Then Filter
    Then Choose Samsung