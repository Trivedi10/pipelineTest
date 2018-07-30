package test_pipeline;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver; 
	String title;

	
  @Test
  public void f() 
  {
	  
	  driver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
	  driver.findElement(By.xpath("//*[@name='psw']")).sendKeys("pass");
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  
	  title=driver.getTitle();
	  
	  System.out.println("Title = "+title);
	  	
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://ec2-18-218-196-66.us-east-2.compute.amazonaws.com:8090/TestWebapp/");
		
  }

  @AfterTest
  public void afterTest() {
  }

}
