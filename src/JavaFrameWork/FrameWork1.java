package JavaFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='KPnG0']")).click();
	WebElement	 username=driver.findElement(By.xpath("//input[@type='text']"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12891289");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		try
		{
			username.sendKeys("kabhisekhar@gmail.com");
		}
		catch(StaleElementReferenceException aa)
		{
			username=driver.findElement(By.xpath("//input[@type='text']"));
			username.sendKeys("kabhisekhar@gmail.com");
		}
		
	}

}
