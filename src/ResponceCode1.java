import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class  ResponceCode1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   SoftAssert s= new SoftAssert(); 
	List<WebElement>  li=driver.findElements(By.xpath("//div[@id='gf-BIG']//a"));
	for(int i=0;i<li.size();i++)
	{
	String Valueofurl= li.get(i).getAttribute("href");
	URL u =new URL(Valueofurl);    // URL class expected an argument:
	 HttpURLConnection conn = (HttpURLConnection)u.openConnection();
   conn.setRequestMethod("HEAD");
   conn.connect();
   int responseCode= conn.getResponseCode();
   System.out.println(responseCode);
	if(responseCode>400)
	{
	System.out.println(li.get(i).getText());
	s.assertTrue(false);
		
		
	}
		
		  
	}   
	   s.assertAll(); 
	    
	}
	
}    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
