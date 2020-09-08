package Interview.Quations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sun.tools.xjc.Driver;

public class ListenersTestNGTestCase implements ITestListener  {
	
	WebDriver driver = new ChromeDriver();
	@Test(priority=1)
	public void TestToPass() {
	System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
    
    driver.get("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/"); 
    driver.getTitle();
    driver.quit();
}
@Test(priority=2)
public void TestToSkip () {
	  System.out.println("This method to skip test" );
	     throw new SkipException("Skipping - This is not ready for testing ");
}


@Test(priority=3) 
public void TestToFail() 
{ 
	 driver.getTitle();
    System.out.println("This method to test fail"); 
}

}
