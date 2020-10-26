package Amazon;

/*
-Selenium for Java
-Selenium Grid
-TestNG

-Browser Driver
-Chrome Driver

ChromeBrowser version : 86.0.4240.75 (current 10-24-2020)
 */

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver ;
    String amazonUrl = "https://www.amazon.com/";




    @BeforeMethod
    public void setUp() {

        //String browserDriverPath = "C:\\Users\\Pchel\\OctJohirulWebAutomation\\BrowserDriver\\windows\\chromedriver.exe";
        // Relative Path
        String browserDriverPath1 = "BrowserDriver/windows/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", browserDriverPath1);
        driver = new ChromeDriver();

        //driver.get(amazonUrl);
        //WebDriver driver = new ChromeDriver();

    }
    @Test
    public void checkHomePageTitle() throws InterruptedException {

        driver.get(amazonUrl);
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = driver.getTitle();

       // Assert.assertEquals(actualTitle,expectedTitle,"")


        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
        Thread.sleep(5000);


    }

    @AfterMethod
    public void tearDown() {
       // driver.close();
        driver.quit();
    }




}
