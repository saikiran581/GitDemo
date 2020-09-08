package Interview.Quations;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Framework\\\\WithMaven\\\\Quations\\\\Drivers\\\\chromedriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onlinesbi.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebDriverWait w = new WebDriverWait(driver, 20);
//        w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[contains(text(),'SBI Mutual Fund')]/preceding::u[1]")));
        driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
        System.out.println("sucessfully clicked");
        driver.close();
     }
	
}
Runtime.getRuntime().exec("F:\\html codes\\Autoit\\fileupload.exe");


driver.close();
System.out.println("File uploaded sucessfully");
//        Robot r = new Robot();
//r.keyPress(KeyEvent.VK_CONTROL);
//r.keyPress(KeyEvent.VK_P);
//r.keyRelease(KeyEvent.VK_CONTROL);
//r.keyRelease(KeyEvent.VK_P);
//r.setAutoDelay(4000);
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyRelease(KeyEvent.VK_ENTER);
