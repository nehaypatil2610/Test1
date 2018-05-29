import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LearnAutomation {

	public static void main(String[] args) {
		System.setProperty("webdrive.chrome.driver","D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://http://learn-automation.com/implicit-wait-in-selenium-webdriver");
		
	}

}
