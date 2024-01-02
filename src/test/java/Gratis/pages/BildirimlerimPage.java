package Gratis.pages;

import Gratis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BildirimlerimPage {
    public BildirimlerimPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

            //(//span[text()='Giriş Yap'])
    @FindBy(css = "div[class='log-actions']")
    public WebElement gırısYap;

    @FindBy(xpath = "//*[text()=' Giriş Yap ']")
    public WebElement girişYap;

    @FindBy(xpath = "//input[@formcontrolname='userId']")
    public WebElement emailGir;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement passwordGir;

    @FindBy(xpath = "(//span[text()='Hesabım'])[2]")
    public WebElement hesabımaTıkla;

    @FindBy(xpath = "//*[text()=' Bildirimlerim ']")
    public WebElement bildirimlerTıkla;

    @FindBy(xpath = "//span[text()='Bildirimlerim']")
    public WebElement bildirimlerGoruldu;

    @FindBy(xpath = "//div[@class='boxclose']")
    public WebElement cerez;

    @FindBy(xpath = "//button[text()='Ayarlar']")
    public WebElement ayarlar;

    @FindBy(id = "[id='cancel']")
    public WebElement tumreddet;

}
