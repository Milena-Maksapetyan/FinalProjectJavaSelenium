package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WelcomePopUpPageTest {
    public static WebDriver driver;
    @BeforeClass
    public static void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void languageChooseTest() throws InterruptedException {
        driver.get("https://www.list.am/");
        Thread.sleep(2000);
        WelcomePopUpPage welcomePopUpPage = new WelcomePopUpPage(driver);
        welcomePopUpPage.languageChoose();


    }



}