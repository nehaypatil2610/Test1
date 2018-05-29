import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSearchResultChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("hello kitty");
		
		List<WebElement> allSearchResult=driver.findElements(By.xpath("//li[contains(@data-text,'hello')] "));

		System.out.println(allSearchResult.size());
		
		
		for(int i=0;i<allSearchResult.size();i++)
		{
			System.out.println(allSearchResult.get(i).getText());
		}
				

	}

}
