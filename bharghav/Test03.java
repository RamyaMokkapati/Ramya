package bharghav;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test03 
{

	public static void main(String[] args) throws Exception
	{
      //launch site
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhargava\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		//Do login
		/*driver.findElement(By.name("identifier")).sendKeys("mokkapatiramya41@gmail.com");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("ramyaloveraji");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);*/
        //click compose
        driver.findElement(By.xpath("//*[text()='Compose']")).click();
        Thread.sleep(5000);
        //fill compose
        driver.findElement(By.name("to")).sendKeys("gaddejayasree@gmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("wishes");
        driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Hi,\n am doing,\n Bye");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Sign out")).click();
        Thread.sleep(5000);
        //close site
        driver.close();
	}

}
