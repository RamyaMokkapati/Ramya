package bharghav;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test51 
{

	public static void main(String[] args)throws Exception 
	{
		//Launch Site
		System.setProperty("webdriver.chrome.driver","D:\\selenium241\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloading panel/functionality/explicit-show-hide/defaults.aspx");
		//Wait for page ready
		WebDriverWait w=new WebDriverWait(driver,10);
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
