package Pages;

import Tests.BaseTest;
import org.testng.annotations.Test;


public class SearchResultSuggestionPageTest extends BaseTest {
  @Test
  public void setSearchResultSuggestion(){
    SearchResultSuggestionPage searchResultSuggestionPage = new SearchResultSuggestionPage(driver);
    searchResultSuggestionPage.SearchResultSuggestionItems();

  }
}