package Gratis.pages;

import Gratis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SosyalMedyaPage {
    public SosyalMedyaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='X'])[2]")
    public WebElement popupClosed;

    @FindBy(xpath = "(//*[text()='Facebook'])")
    public WebElement facebook;

    @FindBy(xpath = "//*[text()='Instagram']")
    public WebElement  instagram;

    @FindBy(xpath = "(//*[text()='X'])[1]")
    public WebElement   x;

    @FindBy(xpath = "(//*[text()='Youtube'])[1]")
    public WebElement   youtube;



    @FindBy(xpath = "//*[text()='Instagram']")
    public WebElement instagramDogrular;

    @FindBy(xpath = "(//div[@class='css-1rynq56 r-bcqeeo r-qvutc0 r-37j5jr r-q4m81j r-a023e6 r-rjixqe r-b88u0q r-1awozwy r-6koalj r-18u37iz r-16y2uox r-1777fci'])[5]")
    public WebElement xDogrula;

    @FindBy(xpath = "(//a[@id='logo'])[1]")
    public WebElement youtubeDogrula;

    @FindBy(xpath = "//h4[text()='Bizi Takip Edin']")
    public WebElement biziTakipEdin;

    @FindBy(css = "span[class$='zb']")
    public WebElement facebookGratisIleBağlantıKur;

}
