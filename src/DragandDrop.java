import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.get("https://jqueryui.com/droppable/");
	      
	      driver.switchTo().frame(0);
	      driver.findElement(By.cssSelector("div[id='draggable']")).click();
	      
	      Actions a = new Actions(driver);
	      
	      WebElement drop = driver.findElement(By.id("draggable"));
	   WebElement drag =driver.findElement(By.id("droppable"));  
	   a.dragAndDrop(drop, drag).build().perform();
	}

}
