package bharghav;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test60 
{

	public static void main(String[] args) 
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium241\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
		driver.findElement(By.id("identifierId")).sendKeys("mokkapatiramya41@gmail.com");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='identifierNext']/child::content"))).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("ramyaloveraji");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]"))).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='z0']/div")));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='gb_Ld']"))).click();
	
	}

}
