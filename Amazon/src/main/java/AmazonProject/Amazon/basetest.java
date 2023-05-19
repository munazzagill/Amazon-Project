package AmazonProject.Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basetest {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asimf\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		//driver.manage().window().maximize();
		
	}
	
	
    public void shots(String picName) throws IOException {
    	
    	File cap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(cap, new File("C:\\Users\\asimf\\eclipse-workspace\\Amazon\\screenshots"+ picName +".png"));
    }
    
    
	
	@Test
	public void addProduct() throws IOException, InterruptedException 
	{
		
		home Home = new home(driver);
		
		Home.searchProduct("Laptop");
		Thread.sleep(5000);
		Home.selectProduct();
		Thread.sleep(5000);
		Home.addToCart();
		Thread.sleep(5000);
		shots("final");
		
	}
	
	
	
	
	@AfterMethod
	public void afterMethod() {
		
		driver.close();
		
	}

}
