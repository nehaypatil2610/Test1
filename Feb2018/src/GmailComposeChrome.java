import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailComposeChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("nehaypatil2610@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("aarav2610@20");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement composeButton= driver.findElement(By.xpath("//div[text()='COMPOSE']"));
		WebDriverWait wait1= new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(composeButton)).click();
		
		/*WebDriverWait wait1= new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(next2)).click();*/
		
		driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("rahulborse27@gmail.com ");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("its Automated Email ;) ");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
	
				

	}

}
