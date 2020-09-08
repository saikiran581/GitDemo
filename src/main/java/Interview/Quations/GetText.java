package Interview.Quations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        String text1 = driver.findElement(By.xpath("//input[@id='autocomplete']")).getText();
        String text2 = driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("Value");
        //String text3 = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).getCssValue(text3);
        
System.out.println("getTextis"+text1);
System.out.println("getAtribute is"+" "+text2);
//System.out.println("getTexti"+ text3);
driver.quit();
}
}