package Pages;

import Constants.SearchFunctionalityConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SearchResultSuggestionPage {
    private WebDriver driver;

    private By searchField = By.xpath(SearchFunctionalityConstants.SEARCHFIELD);

    public SearchResultSuggestionPage(WebDriver driver) {

        this.driver = driver;
    }

    public void SearchResultSuggestionItems() {
        int number = 0;
        WebElement inputSearchField = driver.findElement(searchField);
        inputSearchField.sendKeys("dvin konyak");
//        var result = driver.findElements(By.id("ui-id-1"));
        List<WebElement> webElements = driver.findElements(By.id("ui-id-1"));
        System.out.println("**********************");

//        for (int i = 0; i < ; i++) {
//            if (searchResultsSuggestions[i].contains("dvin")) {
//                number++;
//                continue;
//            }
//        }
//        if (number == SEARCHRESULTSUGGESTIONS.length()) {
//            System.out.println("it is true");
//        }
    }
}

