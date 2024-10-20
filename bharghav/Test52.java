package bharghav;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
public class Test52 
{

	public static void main(String[] args)throws Exception
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium241\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloading panel/functionality/explicit-show-hide/defaults.aspx");
		//Wait for page ready
		FluentWait w=new FluentWait(driver).pollingEvery(2,TimeUnit.SECONDS).withTimeout(10,TimeUnit.SECONDS);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='rcMainTable']/tbody")));
		//Maximize browser and click on data
		driver.manage().window().maximize();
		driver.findElement(By.linkText("6")).click();
		//Wait for load comleation
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		//close site
		driver.close();

	}

}
