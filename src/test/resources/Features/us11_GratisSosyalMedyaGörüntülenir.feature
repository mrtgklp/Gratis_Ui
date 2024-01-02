@US11 @e2e
  Feature: US_11 Kullanıcı Sosyal Medya Hesapları Girebilmeli
    Scenario: TC_01 Kullanıcı sosyal medya hesaplarını tıklanabilir ve kullanılabilir olduğu görebilmeli
      Given Kullanıcı Ana Sayfaya Gider
      Then Kullanıcı Sayfanı Alt Kısmına Gelir ve Sosyal hesabları Görür
      And Kullanıcı facebook Tıklayabilir ve Kullanabilir Oldugunu Görür
      And Kullanıcı Instagram Tıklayabilir ve Kullanabilir Oldugunu Görür
      And Kullanıcı Twitter Tıklayabilir ve Kullanabilir Oldugunu Görür
      And Kullanıcı YouTube Tıklayabilir ve Kullanabilir Oldugunu Görür
      Then Sayfayı Kapat