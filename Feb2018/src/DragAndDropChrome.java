import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		
		
		WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		Actions action =new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		driver.close();
		
		
		
		

		
}
}