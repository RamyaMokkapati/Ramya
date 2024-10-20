





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmillounch 
{

	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
    driver.get("https://www.gmail.com");
   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))//;
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //Do login
    driver.findElement(By.name("identifier")).sendKeys("ravitest0599@gmail.com");
    driver.findElement(By.xpath("//*[text()='Next']")).click();
    driver.findElement(By.name("Passwd")).sendKeys("R@vitest0109");
    driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
    //click compose
    driver.findElement(By.xpath("//*[text()='Compose']")).click();
    driver.findElement(By.id(":62")).click();
    driver.findElement(By.id(":61")).click();
    //fill compose 
   driver.findElement(By.xpath("(//input[@class=\"agP aFw\"])[1]")).sendKeys("rteja0599@gmail.com, ravitest0599@gmail.com");
   //driver.findElement(By.xpath("(//input[@class=\"agP aFw\"])[2]")).sendKeys("mokkapatiramya41@gmail.com, allusariputi@gmail.com");
   driver.findElement(By.name("subjectbox")).sendKeys("Testmail_selenium");
   driver.findElement(By.xpath("//div[@class=\"Am aiL Al editable LW-avf tS-tW\"]")).sendKeys(
		  "Hi good morning,\r\n"
   		+ "\r\n"
   		+ "This mail send while performing selenium automation testing please ignore");
    driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji aoO v7 T-I-atl L3\"]")).click();

   //close site
   // driver.close();


	}

}
