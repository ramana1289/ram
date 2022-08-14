import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ram");  
	      
	   //ALERTS: 
	      
	      
	        driver.findElement(By.id("alertbtn")).click();
	        System.out.println(driver.switchTo().alert().getText());
	        driver.switchTo().alert().accept();
	        driver.findElement(By.id("confirmbtn")).click();
	        Thread.sleep(3000);
	        driver.switchTo().alert().dismiss();
	        Thread.sleep(2000);
	     
	  //LINKTEXT: 
	     
	       driver.switchTo().frame("courses-iframe");
	       driver.findElement(By.linkText("Courses")).click();
	       driver.switchTo().defaultContent();
	}       
       
}  
