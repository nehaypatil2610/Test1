import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CheckboxChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		
		List<WebElement> allcheckbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckbox.size());
		
		allcheckbox.get(1).click();
		allcheckbox.get(2).click();
		allcheckbox.get(4).click();
		allcheckbox.get(5).click();
		
		
	    
	}		
}
