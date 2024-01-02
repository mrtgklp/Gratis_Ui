@US09 @e2e
Feature: US_09
  Scenario: TC_01 Kullanıcı Bildirimlerim kısmını görüntüleyebilmeli
    Given Kullanıcı Url ile Ana Sayfaya  Gider
    Then  Kullanıcı Giriş Yap Butonu Tıklar
    And   Kullanıcı Giriş yap Butonuna Tekrar Tıklar
    And   Kullanıcı Email Bilgisini Girer
    And   Kullanıcı Password Bilgisini Girer
    And   Kullanıcı Hesabım Tıklar
    When   Kullanıcı Açılan Sayfada Bildirimler Tıklar ve Bildirimleri Görüntüler
    Then sayfayı closed