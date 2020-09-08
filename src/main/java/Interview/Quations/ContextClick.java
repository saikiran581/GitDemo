package Interview.Quations;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle.Control;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
       WebElement TextBox = driver.findElement(By.name("firstname"));
       TextBox.sendKeys("Saikiran");
       Actions ac =new Actions(driver);
       //ac.contextClick(TextBox).build().perform();
       ac.doubleClick(TextBox).build().perform();
//       Robot r = new Robot();
//       r.keyPress(KeyEvent vk-);
//        driver.findElement(By.name("lastname")).sendKeys(Keys.CONTROL);

       
       
       
	}
	TakesScreenshot ts = (TakesScreenshot)driver;
	ts.getscr 
	

}
