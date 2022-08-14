import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LinksPageName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	      //FINDING NUMBER OF LINK IN PAGE:
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   int  linksize=  driver.findElements(By.tagName("a")).size();
	      System.out.println(linksize);
	     Assert.assertEquals(linksize, 27); 		
		WebElement footersection=driver.findElement(By.id("gf-BIG"));
	//LIMITING SCOPE OF WEBDRIVER:	
		System.out.println(footersection.findElements(By.tagName("a")).size());
		WebElement firstcolumn = driver.findElement(By.xpath("(//div[@id='gf-BIG']/table/tbody/tr/td/ul)[1]"));
	System.out.println(firstcolumn.findElements(By.tagName("a")).size());	
		//OPEN ALL LINK IN PAGE BY WINDOW HANDLING :
	    // AND FIND OUT THE PAGE WEB PAGE NAME :
		for(int i=0;i<firstcolumn.findElements(By.tagName("a")).size();i++)
		{
			String actionkeys=Keys.chord(Keys.CONTROL,Keys.ENTER);
		firstcolumn.findElements(By.tagName("a")).get(i).sendKeys(actionkeys);
		}
		Thread.sleep(9000);
	//   WINDOWS HANDLE  :
	  	//Set<String> windows=driver.getWindowHandles();
	  	//Iterator<String> it= windows.iterator();
  		//while(it.hasNext())
	  	//{
	  	//	String newwindow=it.next();
		//	driver.switchTo().window(newwindow);
		//	System.out.println(driver.getTitle());
		//}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			String newwindow=it.next();
			 driver.switchTo().window(newwindow);
			 System.out.println(driver.getTitle());
		}
		
		
	}

}

