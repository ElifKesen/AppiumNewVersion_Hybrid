package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ToDoListPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ToDoListStepDef {
    AndroidDriver driver=Driver.getAndroidDriver();
    ToDoListPage page=new ToDoListPage();

    @Given("Kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {
        Driver.getAndroidDriver();

    }
    @When("Uygulaminin basarili bir sekilde acildigi dogrulanir")
    public void uygulaminin_basarili_bir_sekilde_acildigi_dogrulanir() {
        Assert.assertTrue(page.uygulamaAdi.isDisplayed());

    }
    @When("Ileri butonlarina tiklanir ve pop-up lar kapatilir")
    public void ileri_butonlarina_tiklanir_ve_pop_up_lar_kapatilir() {
        ReusableMethods.bekle(2);
        page.continueButton.click();
        ReusableMethods.bekle(2);
        page.ikincicontinueButton.click();
        ReusableMethods.bekle(2);
        page.toolbarbackButton.click();
        ReusableMethods.bekle(2);
        page.IkinciToolbarbackButton.click();

    }
    @When("Gorev ekleme adimina gecilir")
    public void gorev_ekleme_adimina_gecilir() {
        ReusableMethods.bekle(2);
        page.TaskAddButton.click();

    }
    @When("Gorev adi girilir")
    public void gorev_adi_girilir() {
        ReusableMethods.bekle(2);
        page.TaskButton.sendKeys("Kitap oku");

    }
    @When("Gorev kaydedilir")
    public void gorev_kaydedilir() {
        ReusableMethods.bekle(2);
        page.TaskCreateButton.click();

        for (int i = 0; i < 4; i++) {
            Map<String, Object> dokunmaNoktasi=new HashMap<>();
            dokunmaNoktasi.put("x",900);
            dokunmaNoktasi.put("y",1200);
            driver.executeScript("mobile: clickGesture",dokunmaNoktasi);
            ReusableMethods.bekle(5);
        }


    }
    @When("Gorev silinir")
    public void gorev_silinir() {
        ReusableMethods.bekle(5);
        page.TaskOpenButton.click();
        ReusableMethods.bekle(3);
        page.TaskDeleteDreiPunktButton.click();
        ReusableMethods.bekle(3);
        page.TaskDeleteButton.click();
        ReusableMethods.bekle(3);
        page.ConfirmDeleteButton.click();

    }
    @Then("Gorev olusturma sayfasina geri dönüldügü dogrulanir")
    public void gorev_olusturma_sayfasina_geri_dönüldügü_dogrulanir() {
        Assert.assertTrue(page.TaskAddButton.isDisplayed());

    }

    @When("Kullanici ekran fotografi almak icin {string} secer")
    public void kullanici_ekran_fotografi_almak_icin_secer(String ekranGoruntusu) throws IOException {
        ReusableMethods.bekle(3);
        ReusableMethods.screenShotElement(ekranGoruntusu);

    }


}
