package Interview.Quations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ResourceBundle.Control;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
@Listeners(Interview.Quations.ListenersTestNGTestCase.class)
public class Autoit {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\Framework\\WithMaven\\Quations\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://smallpdf.com/word-to-pdf");
    
        
        driver.findElement(By.xpath("//button[@class='l3tlg0-0 hrcxSS']")).click();
        Thread.sleep(4000);
        Runtime.getRuntime().exec("C:\\Users\\My\\OneDrive\\Desktop\\autoit\\fileupload.exe");
        driver.close();
        System.out.println("File uploaded sucessfully");
      
	}

}
