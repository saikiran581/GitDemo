package Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class class2 {

	@Test
	public void Method() throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");
	//	Assert.assertTrue(false);
		System.out.println("Failed the test case");
		
		
		
		     TakesScreenshot ts =  (TakesScreenshot)driver;
		     File src = ts.getScreenshotAs(OutputType.FILE);
		    File dest = new File("C:\\Users\\My\\OneDrive\\Desktop\\screenRc\\sai.jpg");
		     Files.copy(src, dest);
		     
	}
	
}
