package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TeknosaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TeknosaStepDef {

    TeknosaPage page=new TeknosaPage();

    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
        Driver.getAndroidDriver();
    }
    @When("Ilk ekran bolumunden atlaya tiklanir")
    public void ilk_ekran_bolumunden_atlaya_tiklanir() {
        page.atlaButonu.click();
        ReusableMethods.bekle(3);


    }
    @When("Footer kismindan {string} bolumune tiklanir")
    public void footer_kismindan_bolumune_tiklanir(String string) {
        page.kategorilerButonu.click();
        ReusableMethods.bekle(3);

    }
    @When("Kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_bolumune_tiklanir(String kategoriBolumu) {
        ReusableMethods.scrollWithUiScrollableAndClick(kategoriBolumu);
        ReusableMethods.bekle(3);

    }
    @When("Acilan sayfadan {string} secimi yapilir")
    public void acilan_sayfadan_secimi_yapilir(String urun) {
        ReusableMethods.scrollWithUiScrollableAndClick(urun);
        ReusableMethods.bekle(3);

    }
    @When("Filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {
        page.FiltreleButonu.click();
        ReusableMethods.bekle(3);

    }

    @Then("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String marka) {
        page.markaButonu.click();
        ReusableMethods.bekle(3);
        page.markaMetinYazmaKutusu.sendKeys(marka);
        ReusableMethods.bekle(3);
        page.filtrelenmisMarkaKutusu.click();
        ReusableMethods.bekle(3);
        page.SonuclariGosterButonu.click();
        ReusableMethods.bekle(3);

    }
    @When("Siralama yapilirak {string} secilir")
    public void siralama_yapilirak_secilir(String siralamaSecimi) {
        page.SiralaButonu.click();
        ReusableMethods.bekle(3);
        ReusableMethods.scrollWithUiScrollableAndClick(siralamaSecimi);
        ReusableMethods.bekle(3);

    }

    @Then("Fiyatlarin artan duzende oldugu test edilir")
    public void fiyatlarin_artan_duzende_oldugu_test_edilir() {
      String artanDusukFiyat = page.artanDusukFiyat.getText();
      artanDusukFiyat=artanDusukFiyat.replaceAll("\\D","");
        ReusableMethods.bekle(3);

      ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,100);

      String artanYuksekFiyat  =page.artanYuksekFiyat.getText();
      artanYuksekFiyat=artanYuksekFiyat.replaceAll("\\D","");

        Assert.assertTrue(Integer.parseInt(artanYuksekFiyat)>Integer.parseInt(artanDusukFiyat));



    }


    @Then("Kullanici ekran fotografi almak icin {string} secer")
    public void kullanici_ekran_fotografi_almak_icin_secer(String ekranGoruntusu) throws IOException {
        ReusableMethods.bekle(3);
        ReusableMethods.screenShotElement(ekranGoruntusu);
    }
}
