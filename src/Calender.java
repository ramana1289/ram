import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

		//opt.setExperimentalOption("excludeSwithces",Arrays.asList("disable-popup-blocking"));
		 String month="October 2023";
		   String date="10";
		     
		   WebDriver driver = new ChromeDriver(opt);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      driver.manage().window().maximize();
	   
	     
	      driver.get("https://www.path2usa.com/travel-companions");
	      driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	while(!driver.findElement(By.xpath("//div[@style='display: block;'] //th[@class='datepicker-switch']")).getText().contains(month))
		
	{
	//	driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='next']")).click();
		 driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='next']")).click();
	}
List<WebElement>	li=driver.findElements(By.xpath("//td[@class='day']"));
	for(int i=0;i<li.size();i++)
	{
		if(li.get(i).getText().equalsIgnoreCase(date))
		{
			li.get(i).click();
			break;		
		}
	}
	
	}

}
