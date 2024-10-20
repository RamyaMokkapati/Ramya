package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngtest1 
{
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\\\selenium241\\\\chromedriver_win32\\\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.way2sms.com/");
	  WebDriverWait w=new WebDriverWait (driver,20);
	  w.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobileNo")));
	  driver.manage().window().maximize();
	  String t=driver.getTitle();
	  if(t.contains("Free sms"))
	  {
		  Reporter.log("Title Test Passed");
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Reporter.log("Title Test Failed");
		  Assert.assertTrue(false);
      }
		driver.close();  
  }
}
