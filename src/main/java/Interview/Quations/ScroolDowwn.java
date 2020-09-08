package Interview.Quations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScroolDowwn
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//    System.setProperty("webdriver.gecko.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\geckodriver.exe");
//    WebDriver driver1 = new FirefoxDriver();
    driver.get("https://www.google.com/");
    driver.navigate().to("https://mvnrepository.com/");
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,2500)", "");
    
    
    
    Thread.sleep(4000);
    driver.close();
    }
}
