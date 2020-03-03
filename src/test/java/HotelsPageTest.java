import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HotelsPage;


public class HotelsPageTest {

    HotelsPage hotelsPage;

    @BeforeClass
    void init() {
        hotelsPage = new HotelsPage();
    }

    @Test
    void testHotelSearch() {
        hotelsPage.insertDetails();
        String searchResultUrl = hotelsPage.driver.getCurrentUrl();
        Assert.assertTrue(searchResultUrl.contains("hotel-listing"));

    }

    @AfterClass
    void flush() {
        hotelsPage.driver.close();
    }
}

