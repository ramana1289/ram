package MavenProject.SubMavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {
	
	
	@Test
	public void method1() throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Properties prop=new Properties();
		FileInputStream  fis= new FileInputStream("C:\\Users\\N saikumar\\eclipse-workspace\\AUTOMATION LEARNING\\src");
		
		prop.load(fis);
		     
		
		   String url= prop.getProperty("url");
		   
		   
		   
		   driver.get(url);
	}

}
