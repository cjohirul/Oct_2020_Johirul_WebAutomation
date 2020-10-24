package HorizonNJBCBS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public static void main(String[] args) {
        String amazonUrl = "https://www.horizonnjhealth.com/";
        String browserDriverPath = "C:\\Users\\Pchel\\OctJohirulWebAutomation\\BrowserDriver\\windows\\chromedriver.exe";
        // Relative Path
        String browserDriverPath1 = "BrowserDriver/windows/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",browserDriverPath1);
        WebDriver driver = new ChromeDriver();
        driver.get(amazonUrl);
        String Title = driver.getTitle();
        System.out.println("***************************HorizonNJ Health*********************************");
        System.out.println("The BCBS HealthCare Website title is : " + Title);
        driver.close();
    }
}
