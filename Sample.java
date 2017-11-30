package day3;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	
	FirefoxDriver driver;
	@BeforeTest 
    public void setup(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Login(){
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("rahamthullah13");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		driver.close();
		
	}
//@Test(priority=1)
   //public void Fblogin(){
	//driver.get("http://google.com");
	//driver.findElement(By.linkText("Images")).click();
	//driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("nature");
	//driver.findElement(By.xpath(".//*[@id='_fZl']")).click();
	//driver.close();
	
//}
}
