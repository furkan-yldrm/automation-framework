Feature: SearchbyNameFeature

  Scenario: Isim ile arama yapma


    Given URL Start
    Then Login to Account
    When E-posta and Sifre
      | Email | Password |
      | ghezzal@gmail.com | 123bjk |
    Then  Login Successfully
    Then Products Page
    When Fill Value
      | Search |
      | Samsung |
    Then Search