import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkMouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		
		Actions action =new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[@title='Electronics']"));
		action.moveToElement(we).build().perform();
		
		
		
		WebElement Dslr1= driver.findElement(By.xpath("//a[@title='DSLR']"));
		WebDriverWait wait1= new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(Dslr1)).click();
		
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement more=driver.findElement(By.xpath("//div[@class='P5ZUjI _3oELU9']"));		
		WebDriverWait wait2= new WebDriverWait(driver,15);
		wait2.until(ExpectedConditions.elementToBeClickable(more)).click();
		
		
		driver.findElement(By.xpath("//div[@class='_6MvKf3']")).click();
		
		
		
		
		
		
	}
	
	
	
}
