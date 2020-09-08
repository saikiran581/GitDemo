package Interview.Quations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
       // System.out.println(driver.getTitle());
        String actualTitle = "Facebook – log in or sign up";
        Assert.assertEquals(driver.getTitle(),actualTitle);
		driver.findElement(By.id("email")).sendKeys("SoftwareTestingMaterial.com");
		//driver.get("https://www.facebook.com");
		actualTitle = "Facebook – log in o sign up";
		try {
			
		Assert.assertEquals(driver.getTitle(), actualTitle,"Title  not matched");
		}
		catch(Exception e) {
		System.out.println("System problem");
        e.printStackTrace();}
		finally {
			
		}
     
	}

}
