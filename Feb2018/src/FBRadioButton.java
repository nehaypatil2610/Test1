import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement> allradiobutton = driver.findElements(By.xpath("//input[@name='sex']"));
		System.out.println(allradiobutton.size());
		allradiobutton.get(1).click();
		allradiobutton.get(0).click();
		

	}

}
