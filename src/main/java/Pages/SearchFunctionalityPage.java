package Pages;

import Constants.SearchFunctionalityConstants;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Constants.SearchFunctionalityConstants.ALLITEMSFORDVINKONYAK;

public class SearchFunctionalityPage {
    private WebDriver driver;
    private By searchField = By.xpath(SearchFunctionalityConstants.SEARCHFIELD);
    private By searchFieldIcon = By.xpath(SearchFunctionalityConstants.SEARCHFIELDICON);
    private By allItemsForDvinKonyak = By.cssSelector(SearchFunctionalityConstants.ALLITEMSFORDVINKONYAK);
    private By minPrice = By.id(SearchFunctionalityConstants.MINPRICE);
    private By maxPrice = By.id(SearchFunctionalityConstants.MAXPRICE);
    private By goButton = By.id(SearchFunctionalityConstants.GOBUTTON);
    private By filteredItemsByPrice = By.xpath(SearchFunctionalityConstants.FILTEREDITEMSBYPRICE);

    public SearchFunctionalityPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForInput(){
        WebElement searchFieldElement = driver.findElement(searchField);
        searchFieldElement.clear();
        searchFieldElement.sendKeys("dvin konyak");
        WebElement selectSearchFieldIcon = driver.findElement(searchFieldIcon);
        selectSearchFieldIcon.click();
    }

    public List<WebElement> getSearchResult() throws InterruptedException{
        return driver.findElements(By.cssSelector(ALLITEMSFORDVINKONYAK));
    }

    public void addPriceFilter() {
        WebElement minPriceField = driver.findElement(minPrice);
        minPriceField.sendKeys("200000");
        WebElement maxPriceField = driver.findElement(maxPrice);
        maxPriceField.sendKeys("400000");
        WebElement goBtn = driver.findElement(goButton);
        goBtn.click();
    }

    public List<WebElement> getFilteredSearchResult(){
        return driver.findElements(filteredItemsByPrice);
    }
}

