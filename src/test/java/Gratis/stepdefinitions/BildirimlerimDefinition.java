package Gratis.stepdefinitions;

import Gratis.pages.BildirimlerimPage;
import Gratis.utilities.ConfigReader;
import Gratis.utilities.Driver;
import Gratis.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class BildirimlerimDefinition {

    BildirimlerimPage bildirimlerimPage = new BildirimlerimPage();

    @Given("Kullanıcı Url ile Ana Sayfaya  Gider")
    public void kullanıcıUrlIleAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("gratis_url"));
    }

    @Then("Kullanıcı Giriş Yap Butonu Tıklar")
    public void kullanıcı_giriş_yap_butonu_tıklar() {
        bildirimlerimPage.gırısYap.click();
        Driver.bekle(3);


    }

    @And("Kullanıcı Giriş yap Butonuna Tekrar Tıklar")
    public void kullanıcıGirisYapButonunaTekrarTıklar() {
        bildirimlerimPage.girişYap.click();
    }

    @Then("Kullanıcı Email Bilgisini Girer")
    public void kullanıcı_email_bilgisini_girer() {
        bildirimlerimPage.emailGir.sendKeys(ConfigReader.getProperty("mail"), Keys.ENTER);
    }

    @Then("Kullanıcı Password Bilgisini Girer")
    public void kullanıcı_password_bilgisini_girer() {
        bildirimlerimPage.passwordGir.sendKeys(ConfigReader.getProperty("password"), Keys.ENTER);
        Driver.bekle(5);
    }

    @And("Kullanıcı Hesabım Tıklar")
    public void kullanıcıHesabımTıklar() {
        bildirimlerimPage.hesabımaTıkla.click();
        Driver.bekle(5);
        Driver.getDriver().manage().window().fullscreen();
    }

    @Then("Kullanıcı Açılan Sayfada Bildirimler Tıklar ve Bildirimleri Görüntüler")
    public void kullanıcı_açılan_sayfada_bildirimler_tıklar_ve_bildirimleri_görüntüler() {

        bildirimlerimPage.bildirimlerTıkla.click();
        Driver.bekle(5);
        Assert.assertTrue("Bildirimler", bildirimlerimPage.bildirimlerGoruldu.isDisplayed());

        ReusableMethods.tumSayfaResmi();
    }


    @Then("sayfayı closed")
    public void sayfayıClosed() {
        Driver.closeDriver();
    }
}
