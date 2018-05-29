import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitAndExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Bipin\\Chrome driver 2.30\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("SeleniumForSure");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bipin_1234");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//explicit wait
WebElement compose_button=driver.findElement(By.xpath("//div[text()='COMPOSE']"));

WebDriverWait wait = new WebDriverWait(driver, 5);
wait.until(ExpectedConditions.elementToBeClickable(compose_button)).click();		

	}

}

















