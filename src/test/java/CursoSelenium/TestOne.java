package cursoSelenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class TestOne {

    String driverChrome = "C:\\Drivers\\chromedriver.exe";
    String driverGecko = "C:\\Drivers\\geckodriver.exe";
    WebDriver driver;

    @Before
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", driverChrome);
        System.setProperty("webdriver.gecko.driver", driverGecko);
        // driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void navigateGoogle() {
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }

    @After
    public void endTest(){
        driver.quit();
    }

}
