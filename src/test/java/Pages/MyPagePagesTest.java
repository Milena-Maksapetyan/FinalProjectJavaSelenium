package Pages;

import Tests.BaseTest;
import org.testng.annotations.Test;


public class MyPagePagesTest extends BaseTest {
    @Test
    public void MyPageTest(){
        MyPagePages myPagePages = new MyPagePages(driver);
        myPagePages.createPage();
    }
}