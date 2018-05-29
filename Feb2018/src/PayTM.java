import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PayTM {

	public static void main(String[] args)  {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//input[@name='Gas']")).click();
	}

}
