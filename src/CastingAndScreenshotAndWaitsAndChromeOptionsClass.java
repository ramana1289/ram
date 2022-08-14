import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CastingAndScreenshotAndWaitsAndChromeOptionsClass {

	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//	int i=10;
	//	double db=18.77;
		
//  IMPLICT CASTING:
		
	//	double xyz=i;
	//	System.out.println(xyz);
	
//	EXPLICT CASTING:
		
	//	int yy= (int) db;
	//	System.out.println(yy);
// SCREENSHOT:		
	//	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	 //     WebDriver driver = new ChromeDriver();
	      
	  //    driver.manage().window().maximize();
	      
	//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 //     driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	  //TakesScreenshot ram=(TakesScreenshot)driver;
	 // File src =ram.getScreenshotAs(OutputType.FILE);
	 // File des =new File("D:\\New folder\\New folder1.png");
	 // FileUtils.copyFile(src, des);
		

		
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//HEADLESS MODE RUNNING CHROME:		 
	//	 ChromeOptions opt =new ChromeOptions();
		 
	//	 opt.addArguments("--headless");
//TO ENTER INSECURE SITE :
		 //opt.setAcceptInsecureCerts(true);
		 
// TO REMOVE POPUPS:
		// opt.setExperimentalOption("excludeSwithes",Arrays.asList("disbale-popup-blocking"));
		// WebDriver driver =new ChromeDriver(opt);
		 WebDriver driver= new ChromeDriver();
		 
//IMPLICITY WAIT :		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
		 
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 
		 
		 driver.findElement(By.id("inputUsername")).sendKeys("ram@gamil.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
//EXPLICITY WAIT :
		 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.className("error")));
		System.out.println(driver.findElement(By.className("error")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
