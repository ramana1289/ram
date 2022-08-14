package opps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://smallpdf.com/jpg-to-pdf");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\RAM\\docxxx\\mar.exe");

	}

}
