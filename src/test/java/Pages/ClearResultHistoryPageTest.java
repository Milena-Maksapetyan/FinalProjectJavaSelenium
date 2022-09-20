package Pages;

import Tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClearResultHistoryPageTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        ClearResultHistoryPage clearResultHistoryPage = new ClearResultHistoryPage(driver);
        clearResultHistoryPage.ClearResultHistory();
    }


}