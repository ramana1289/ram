import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	   WebElement element =   driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
	   Select f = new Select(element);
	 Thread.sleep(5000);
	 f.selectByIndex(2);
	 f.selectByValue("INR");
	 f.selectByVisibleText("USD");
	 driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	 
     for(int i=0;i<5;i++)
	{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	}
	
	driver.findElement(By.xpath("//input[@class='buttonN']")).click();
	
	driver.findElement(By.xpath("//input[@menuselection='false']")).click();
	driver.findElement(By.xpath("//a[@value='VTZ']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
	driver.findElement(By.xpath("//a[@value='GOI']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ind");
	 List<WebElement>  li= driver.findElements(By.xpath("//a[@tabindex='-1']"));
	 for(int i=0; i<li.size();i++)
	 {
		if(li.get(i).getText().equalsIgnoreCase("india"))
		{
			li.get(i).click();
		}
	 }
	 
	
	
	
	
	}

}
