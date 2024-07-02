Feature: CreateOrderFeature

  Scenario: Sipariş oluşturma

    Given Siteye git
    Then Hesabina gir
    When Kullanici bilgilerini gir
      | Email | Password |
      | ghezzal@gmail.com | 123bjk |
    Then Giris yap
    Then Urunler sayfasina git
    Then Sepete ekle
    Then Sepete git
    Then Miktari arttir
    When Adresi gir
      | Address |
      | Saffet Mahallesi / Pınar Hisar Caddesi / Gündüz Apartmanı / Daire: 22  |
    Then Odeme yontemi sec
    Then Sepeti Onayla
    Then Onayla