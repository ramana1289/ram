import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//iframe[@style='width: 100%; height: 600px']"));
		driver.switchTo().frame(ele);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Practice")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]")).click();
	}

}
