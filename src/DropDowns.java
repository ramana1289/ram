import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      Thread.sleep(5000);		
   driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")).click();
      
   WebElement element= driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
   Select  f = new Select(element);
   Thread.sleep(5000);
   
   f.selectByIndex(0);     
   
   f.selectByValue("INR");
   
   f.selectByVisibleText("AED");
   
     driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
   
    
    
     
    for(int i=0;i<4;i++)
     
    	  
    {
    	 driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
    }
    driver.findElement(By.id("btnclosepaxoption")).click();
     String adultsize = driver.findElement(By.xpath("//div[@class='paxinfo']")).getText();
    System.out.println(adultsize);
    Assert.assertEquals(adultsize ,"5 Adult");
    	 
     driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
     driver.findElement(By.cssSelector("a[value='VTZ']")).click(); 	 
     driver.findElement(By.cssSelector("input[name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();	 
     driver.findElement(By.cssSelector("a[text='Bengaluru (BLR)']")).click(); 	
     driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
     List<WebElement> li= driver.findElements(By.cssSelector("a[tabindex='-1']"));
     for(int i=0;i<li.size();i++)
     {
  	   if(li.get(i).getText().equalsIgnoreCase("india"))
	   {
    	 li.get(i).click();
	   } 
    	 
    } 
	}}	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	
    

     
	
     

