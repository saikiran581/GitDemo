package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class class1 {
@Test
public  void verfiTitle() {
	System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.youtube.com/");
   String actual = driver.getTitle();
  String expected= "YouTube";
 // SoftAssert sa = new SoftAssert();
  
  Assert.assertEquals(actual, expected);
 
  System.out.println("print sucessfully");

  driver.close();
 // sa.assertAll();
}
}
