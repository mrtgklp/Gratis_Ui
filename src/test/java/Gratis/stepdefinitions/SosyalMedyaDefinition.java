package Gratis.stepdefinitions;

import Gratis.pages.SosyalMedyaPage;
import Gratis.utilities.ConfigReader;
import Gratis.utilities.Driver;
import Gratis.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import static Gratis.utilities.Driver.getDriver;

public class SosyalMedyaDefinition {

    SosyalMedyaPage sosyalMedyaPage = new SosyalMedyaPage();

    @Given("Kullanıcı Ana Sayfaya Gider")
    public void kullanıcı_ana_sayfaya_gider() {
        getDriver().get(ConfigReader.getProperty("gratis_url"));

    }

    @Then("Kullanıcı Sayfanı Alt Kısmına Gelir ve Sosyal hesabları Görür")
    public void kullanıcı_sayfanı_alt_kısmına_gelir_ve_sosyal_hesabları_görür() {
        Driver.bekle(6);
        ReusableMethods.scrollEnd();
        ReusableMethods.scroll(sosyalMedyaPage.biziTakipEdin);

    }

    @Then("Kullanıcı facebook Tıklayabilir ve Kullanabilir Oldugunu Görür")
    public void kullanıcı_facebook_tıklayabilir_ve_kullanabilir_oldugunu_görür() {
        sosyalMedyaPage.facebook.click();
        Driver.bekle(5);
        ReusableMethods.yeniSekmeAc();
        sosyalMedyaPage.facebookGratisIleBağlantıKur.isDisplayed();
        ReusableMethods.anaSekmeyeGeriDon();

    }

    @Then("Kullanıcı Instagram Tıklayabilir ve Kullanabilir Oldugunu Görür")
    public void kullanıcı_ınstagram_tıklayabilir_ve_kullanabilir_oldugunu_görür() {

        sosyalMedyaPage.instagram.click();

        sosyalMedyaPage.instagramDogrular.isDisplayed();
        ReusableMethods.anaSekmeyeGeriDon();
    }

    @Then("Kullanıcı Twitter Tıklayabilir ve Kullanabilir Oldugunu Görür")
    public void kullanıcı_twitter_tıklayabilir_ve_kullanabilir_oldugunu_görür() {
        sosyalMedyaPage.twitter.click();
        ReusableMethods.anaSekmeyeGeriDon();
    }

    @Then("Kullanıcı YouTube Tıklayabilir ve Kullanabilir Oldugunu Görür")
    public void kullanıcı_you_tube_tıklayabilir_ve_kullanabilir_oldugunu_görür() {
        sosyalMedyaPage.youtube.click();
        Driver.bekle(6);
    }

    @Then("Sayfayı Kapat")
    public void sayfayıKapat() {
        Driver.closeDriver();
    }
}
