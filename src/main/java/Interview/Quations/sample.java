package Interview.Quations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;

public class sample {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com");
    //Collects the webelement
WebElement ele = driver.findElement(By.xpath("//*[@id='Email']"));
    //Create object of a JavascriptExecutor interface
JavascriptExecutor js = (JavascriptExecutor) driver;
    //use executeScript() method and pass the arguments 
    //Here i pass values based on css style. Yellow background color with solid red color border. 
js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
}
}
