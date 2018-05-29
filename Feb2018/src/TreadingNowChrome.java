import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TreadingNowChrome {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.yahoo.com");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@id='applet_p_32209491']"));
	List<WebElement> allnews =driver.findElements(By.xpath("//a[contains(@href,'//in.search.yahoo.com/search?p=')]"));
	System.out.println(allnews.size());
	for(int i=0;i<allnews.size();i++){
		System.out.println(allnews.get(i).getText());
	}
	
	}

}
