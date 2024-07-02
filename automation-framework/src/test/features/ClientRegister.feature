Feature: AdminLoginFeature

  Scenario: Register a new user

    Given Go to the url
    And Click the Kayit
    When Enter UserData
      | KayitAd | KayitSoyad | KayitEmail | KayitTel | KayitAdres | KayitPass | KayitOnayPass |
      | Salih | Ucan | Salih.ucan@outlook.com | 05488888888 | BentbaSi Mh. 1 Sk. Zambak Sitesi No: 39 IStanbul | Salih123. | Salih123. |
    Then Click the KayitOl
    Then See its Successful

