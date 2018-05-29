import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class FaceBook {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//Login and Log Out
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("8888734198");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("aarav2610@20");
	
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
	    
	    Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Log Out")).click();
	    
	
		//Clicking the radio Button
	
		List<WebElement> allradiobutton = driver.findElements(By.xpath("//input[@name='sex']"));
	    System.out.println(allradiobutton.size());
	    allradiobutton.get(0).click();
	    Thread.sleep(3000);
	    allradiobutton.get(1).click();
	    allradiobutton.get(0).click();
	
	
	//Fill the First name box
	
	
	    driver.findElement(By.xpath("//*[@id='u_0_k']")).sendKeys("Neha");
	    driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Patil");
	
	
	}
} 
