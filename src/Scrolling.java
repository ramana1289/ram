import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//SCROLLING PAGE:	      
  JavascriptExecutor sj =  (JavascriptExecutor)driver;
   sj.executeScript("window.scrollBy(0,600)");
   
 //TOP SCROLLING ELEMT LEVEL:
   sj.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
   List<WebElement> listvalue=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
  int sum=0;
   for(int i=0;i<listvalue.size();i++)
   {
	  sum=sum+Integer.parseInt(listvalue.get(i).getText());  
   }
   System.out.println(sum);
         
         String ramfinal=   driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
   
        String textsplited= ramfinal.split(":")[1];
   
   System.out.println(textsplited.trim());
   int valuefinal=Integer.parseInt(textsplited.trim());
   Assert.assertEquals(sum,valuefinal);
   
   
   
   
   }
	}


