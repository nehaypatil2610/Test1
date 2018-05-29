import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumProgram {

	public static void main(String[] args) {
		
		//open the firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//how to open the URL
		driver.get("https://login.yahoo.com/?.src=fp&.intl=in&.lang=en-IN&.done=https%3a//mail.yahoo.com");
		
		//send the text in email address field
		//driver.findElement(By.id("login-username")).sendKeys("SeleniumForSure");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("SeleniumForSure");
		
		//click on button
		driver.findElement(By.id("login-signin")).click();
	}

}


























