import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aaaaaaaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://upsc.gov.in/");
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,400)");
//		driver.findElement(By.xpath("//div[@class='views-field views-field-field-exam-name']/div/a/ul/li[1]")).click();
//  driver.findElement(By.xpath("//tr[@class='odd']/td/ul/li/a")).click();
//	}

  driver.get("https://www.amazon.in/");
	      
	      Actions a = new Actions(driver);
     
       WebElement accbutton=   driver.findElement(By.id("nav-link-accountList"));   
       Thread.sleep(5000);
    // a.moveToElement(accbutton).build().perform();
    
       WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
       a.moveToElement(search).click().sendKeys("redmi mobiles").build().perform();
    //  a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("samsung").build().perform();
    //  a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("samsung").doubleClick().build().perform();
      
    //  a.moveToElement(accbutton).contextClick().build().perform(); 	
		
		
	}		
		
}
