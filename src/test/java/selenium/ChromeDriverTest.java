package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverTest {

    private static WebDriver driver;

    @Before
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void exampleSelenium() throws InterruptedException {
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("hhtp://www.google.com/");
        Thread.sleep(1000);
    }

    /*@Test
    public void testGoogleSearch() throws InterruptedException {
        try {

        } finally {

        }
    }*/

    @After
    public void tearDown() {
        driver.quit();
    }
}