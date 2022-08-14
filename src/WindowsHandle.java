import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	 
  //WINDOW HANDING :   
	      
	      
	    //  driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	    //  driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
	      
	
//	Set<String> Windowsid = driver.getWindowHandles();
//	Iterator<String>  it = Windowsid.iterator();
	
//	String parentWindow=it.next();
//	String childWindow=it.next();
//	driver.switchTo().window(childWindow);
 //   String emailid=   driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();

//	driver.switchTo().window(parentWindow);
//	driver.findElement(By.id("username")).sendKeys(emailid);

	//ASSERTIONS.JAVA :
	      
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	      
	      Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	      driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	      Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	      int checkboxsize =driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	      Assert.assertEquals(checkboxsize,6);
	    // String adultsize = driver.findElement(By.id("divpaxinfo")).getText();
	      String adultsize = driver.findElement(By.xpath("//div[@class='paxinfo']")).getText();
	      System.out.println(adultsize);
	      Assert.assertEquals(adultsize, "1 Adult");
	      
	
	}
	
	

}
