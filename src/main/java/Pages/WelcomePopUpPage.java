package Pages;


import Constants.WelcomePopUpConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePopUpPage {
    private WebDriver driver;
    private By welcomePopUpPage = By.className(WelcomePopUpConstants.WELCOMEMESSAGE);
    private By armenianLanguage = By.xpath(WelcomePopUpConstants.ARMENIANLANGUAGE);

    public WelcomePopUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void languageChoose(){
        WebElement chooseLanguage = driver.findElement(armenianLanguage);
        chooseLanguage.click();
    }
}

