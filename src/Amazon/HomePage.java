package Amazon;

/*
-Selenium for Java
-Selenium Grid
-TestNG

-Browser Driver
-Chrome Driver

ChromeBrowser version : 86.0.4240.75 (current 10-24-2020)
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {

    public static void main(String[] args) {

        String amazonUrl = "https://www.amazon.com/";
        String browserDriverPath = "C:\\Users\\Pchel\\OctJohirulWebAutomation\\BrowserDriver\\windows\\chromedriver.exe";
        // Relative Path
        String browserDriverPath1 = "BrowserDriver/windows/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",browserDriverPath1);
        WebDriver driver = new ChromeDriver();
        driver.get(amazonUrl);
        String Title = driver.getTitle();
        System.out.println("***************************Amazon*********************************");
        System.out.println("The Retail online store title is : " + Title);
        driver.close();
    }
}
