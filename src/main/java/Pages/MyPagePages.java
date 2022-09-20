package Pages;

import Constants.MyPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyPagePages {
    private WebDriver driver;
    private By myPageButton = By.className(MyPageConstants.MYPAGEBUTTON);
    private By createAccount=By.className(MyPageConstants.CREATEACCOUNT);
    private By emailField = By.xpath(MyPageConstants.EMAILFIELD);
    private By passwordField =By.xpath(MyPageConstants.PASSWORDFIELD);
    private By confirmPasswordField = By.xpath(MyPageConstants.CONFIRMPASSWORDFIELD);
    private By agreeButton = By.id(MyPageConstants.AGREEBUTTON);

    public MyPagePages(WebDriver driver) {
        this.driver = driver;
    }
    public void createPage(){
        WebElement clickPageButton = driver.findElement(myPageButton);
        clickPageButton.click();
        WebElement clickCreateAccount = driver.findElement(createAccount);
        clickCreateAccount.click();
        WebElement inputEmailField = driver.findElement(emailField);
        inputEmailField.sendKeys("maksapetyan@gmail.com");
        WebElement inputPasswordField = driver.findElement(passwordField);
        inputPasswordField.sendKeys("Test123456");
        WebElement inputConfirmPassword = driver.findElement(confirmPasswordField);
        inputConfirmPassword.sendKeys("Test123456");
        WebElement clickAgreeButton = driver.findElement(agreeButton);
        clickAgreeButton.click();

    }
}
