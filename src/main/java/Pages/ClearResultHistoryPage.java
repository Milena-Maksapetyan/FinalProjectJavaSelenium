package Pages;

import Constants.ClearResultsHistoryConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class ClearResultHistoryPage {
    private WebDriver driver;
    private By searchField = By.xpath(ClearResultsHistoryConstant.SEARCHFIELD);
    private By searchFieldIcon = By.xpath(ClearResultsHistoryConstant.SEARCHFIELDICON);
    public By clearSearchHistory= By.xpath(ClearResultsHistoryConstant.CLEARSEARCHHISTORY);
    public By closeSeachField = By.cssSelector(ClearResultsHistoryConstant.CLOSESEARCHFIELD);

    public ClearResultHistoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClearResultHistory() throws InterruptedException {
        WebElement inputSearchField = driver.findElement(searchField);
        inputSearchField.sendKeys("dvin");
        WebElement selectSearchFieldIcon = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(searchFieldIcon));
        WebElement closeSearchField = driver.findElement(closeSeachField);
        closeSearchField.click();

        WebElement clearSearchHisory = this.getClearSearchHistoryButton();
        if (clearSearchHisory != null) {
            clearSearchHisory.click();
        }
    }

    public WebElement getClearSearchHistoryButton(){
        try {
             return driver.findElement(clearSearchHistory);
        }
        catch (NoSuchElementException e){
            return null;

        }
    }}

