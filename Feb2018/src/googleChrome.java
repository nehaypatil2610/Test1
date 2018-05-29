import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class googleChrome {

	 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("helloween");
	}

}
