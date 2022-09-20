package Tests;

import Pages.SearchFunctionalityPage;
import Pages.SearchFunctionalityPageTest;
import Pages.WelcomePopUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public static WebDriver driver;
    SearchFunctionalityPage searchFunctionalityPage;
    @BeforeClass
    public static void initWebDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        webDriverHelloWordTest();
    }

    public static  void webDriverHelloWordTest() throws InterruptedException {
        driver.get("https://www.list.am/");
        Thread.sleep(2000);
        WelcomePopUpPage welcomePopUpPage = new WelcomePopUpPage(driver);
        welcomePopUpPage.languageChoose();

    }}

