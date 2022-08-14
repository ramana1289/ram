import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearAndCheckboxAndActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	//CLEAR TEXT; 
	  
	     // driver.get("https://facebook.com");
	     // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kabhisekhar");
	     // driver.findElement(By.xpath("//input[@type='text']")).clear();
	     // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ram123");
	      
	//CHECKBOX:
	      
	//   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");   
	// driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
    //System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	
   //System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());	
	
	      
 //ACTIONSTEST:
	      
	      driver.get("https://www.amazon.in/");
	      
	      Actions a = new Actions(driver);
     
       WebElement accbutton=   driver.findElement(By.id("nav-link-accountList"));     
    // a.moveToElement(accbutton).build().perform();
    
       WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
      // a.moveToElement(search).click().sendKeys("ram").build().perform();
    //  a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("samsung").build().perform();
    //  a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("samsung").doubleClick().build().perform();
      
      a.moveToElement(accbutton).contextClick().build().perform(); 
	}

  }
