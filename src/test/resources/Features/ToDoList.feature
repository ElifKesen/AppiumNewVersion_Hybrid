Feature: Kullanici ilgili APK icin gerekli testleri yapmalidir

  Scenario:Kullanici uygulama uzerinde ilgili testleri yapar
    Given Kullanici uygulamayi acar
    When Uygulaminin basarili bir sekilde acildigi dogrulanir
    When Ileri butonlarina tiklanir ve pop-up lar kapatilir
    And Gorev ekleme adimina gecilir
    And Gorev adi girilir
    And Gorev kaydedilir
    And Gorev silinir
    Then Gorev olusturma sayfasina geri dönüldügü dogrulanir

  @todo
  Scenario:Kullanici uygulama uzerinde ilgili testleri yapar
    Given Kullanici uygulamayi acar
    When Uygulaminin basarili bir sekilde acildigi dogrulanir
    When Kullanici ekran fotografi almak icin "Welcome to To-do List" secer