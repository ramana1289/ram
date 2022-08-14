import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	//	ChromeOptions opt=new ChromeOptions();
	//	opt.setAcceptInsecureCerts(true);
	//	opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		  WebDriver driver = new ChromeDriver();
		  String month="Dec";
			String date="20";
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      driver.get("https://makemytrip.com");
	     Thread.sleep(5000);
	      driver.findElement(By.xpath("//label[@for='departure']")).click();
	      Thread.sleep(5000);
	      
	      while(true)
	      {
	    	  if(driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText().contains(month))
	    	  {
	    		  break;
	    	  }
	    	  else
	    	  {
	    		  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	    	  }
	      } 
	      
	    	 Thread.sleep(5000); 
	     List<WebElement> li=driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1]  //div[@class='DayPicker-Day']/div/p[1]"));
	           for(int i=0;i<li.size();i++)
               {
	      	   if(li.get(i).getText().equalsIgnoreCase(date))
     		  {
		    	  li.get(i).click();
		       }
              }
	           
	  
	           
	           
	           
	           
	           
	           
	}}
	


