package Pages;

import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchFunctionalityPageTest extends BaseTest {


    @Test
    public void searchFunctionality() throws InterruptedException {
        SearchFunctionalityPage searchFunctionalityPage = new SearchFunctionalityPage(driver);
        searchFunctionalityPage.searchForInput();
    }

    @Test
    public void allItemsCountForDvinKonyak() throws InterruptedException {
        SearchFunctionalityPage searchFunctionalityPage = new SearchFunctionalityPage(driver);
        searchFunctionalityPage.searchForInput();
        var items = searchFunctionalityPage.getSearchResult();
        for (int i = 0; i < items.size(); i++) {
            var text = items.get(i).getText().toUpperCase();
            var result = text.contains("ԱԼԿՈՀՈԼԱՅԻՆ ԸՄՊԵԼԻՔՆԵՐ");
            result |= text.contains("ԿՈՆՅԱԿ");
            result |= text.contains("ԴՎԻՆ");
            result |= text.contains("ДВИН");
            result |= text.contains("DVIN");
            Assert.assertEquals(result, true);
        }
    }

    @Test
    public void testFilterByPrice(){
        SearchFunctionalityPage searchFunctionalityPage = new SearchFunctionalityPage(driver);
        searchFunctionalityPage.searchForInput();
        searchFunctionalityPage.addPriceFilter();
        var items = searchFunctionalityPage.getFilteredSearchResult();
        for (int i = 0; i < items.size(); i++) {
            String text = items.get(i).getText();
            String[] lines = text.split("\n");
//            System.out.println(text);
            for (String line : lines){
                if (line.contains("֏")){
                    line = line.replaceAll("[^\\d]", "");
                    int price = Integer.parseInt(line);
                    Assert.assertTrue(price >= 200000 && price <= 400000);
                }
            }
        }
    }
}


