import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.ilovepdf.com/word_to_pdf");
		 driver.manage().window().maximize();	
			driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
			Thread.sleep(5000);
			Runtime.getRuntime().exec("C:\\RAM\\docxxx\\marr.exe");
			
	}

}
