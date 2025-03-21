Feature: Kullanici uygulama icin gorevleri yerine getirir

  Scenario:Kullanici uygulama uzerinde ilgili bolumu test eder
    Given Uygulama baslatilir
    When Ilk ekran bolumunden atlaya tiklanir
    When Footer kismindan "Kategoriler" bolumune tiklanir
    And Kategoriler bolumunden "Kişisel Bakım" bolumune tiklanir
    And Acilan sayfadan "Saç Bakım" secimi yapilir
    And Filtrele bolumune tiklanir
    Then Marka "Arzum" bolumunden marka secimi yapilir
    When Siralama yapilirak "Artan Fiyat" secilir
    Then Fiyatlarin artan duzende oldugu test edilir

  @teknosa
  Scenario:Kullanici uygulama uzerinde ilgili bolumu test eder
    Given Uygulama baslatilir
    When Ilk ekran bolumunden atlaya tiklanir
    When Footer kismindan "Kategoriler" bolumune tiklanir
    Then Kullanici ekran fotografi almak icin "Kampanyalar" secer