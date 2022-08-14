import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practices2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      Thread.sleep(5000);
	driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")).click();
	WebElement element=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
	Select s=new Select(element);
	Thread.sleep(5000);
	s.selectByIndex(1);
	s.selectByValue("AED");
	s.selectByVisibleText("USD");
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	for(int i=0;i<4;i++)
	{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	}
	
	driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.xpath("//a[@text='Gorakhpur (GOP)']")).click();
	Thread.sleep(5000);
	
	
	
	
	
	
	
	
	
	}
	

}