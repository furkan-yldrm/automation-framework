Feature: AdminLoginFeature

  Scenario: Check Admin Login with correct username and password

    Given Go to the url
    And Click the Kayit
    When Enter UserData
      | KayitAd | KayitSoyad | KayitEmail | KayitTel | KayitAdres | KayitPass | KayitOnayPass |
      | Furkan   | Yildirim | yildirim.frkn@outlook.com | 05436485516 | Sunullah Mh. 911 Sk. Zambak Sitesi No: 21 Bandırma | furkan123. | furkan123. |
    Then Click the KayitOl
    Then See its Successful

