import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Responcecode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("-headless");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
	     List<WebElement>	li=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
	     int sum=0;
		for(int i=0;i<li.size();i++)
		{
		sum=sum+Integer.parseInt(li.get(i).getText());
		}
		System.out.println(sum);
		
		String Final = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		System.out.println(Final);
		String spilted=Final.split(":")[1];
		System.out.println(spilted.trim());
		int valuefinal=Integer.parseInt(spilted.trim());
		Assert.assertEquals(sum, valuefinal);
	}
	}	