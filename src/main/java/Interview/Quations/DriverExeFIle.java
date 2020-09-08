package Interview.Quations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverExeFIle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Framework\\\\WithMaven\\\\Quations\\\\Drivers\\\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
       List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
       int count = cb.size();
       
       System.out.println(count);
       for(int i=1;i<=count;i++) {
    	   cb.get(i).click();
       
    	   System.out.println(cb.get(i).getText());
    	   if(cb.contains("Student")) {
    		   cb.get(i).click();
    	   }
    	  
       }
       driver.close();
       
       
       
	}

}
