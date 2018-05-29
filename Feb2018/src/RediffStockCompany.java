import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffStockCompany {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Web list  array of all company name and print the size of the same
		List<WebElement> CompanyName= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println(CompanyName.size());
		
		//Web list array of all current prize and print size of the array
		List<WebElement> CurrentPrice= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(CurrentPrice.size());
				
				
		for(int i=0;i<CompanyName.size();i++){
			System.out.println(CompanyName.get(i).getText() +"       "+  CurrentPrice.get(i).getText());
		}
		
		//System.out.print(CompanyName.get(2).getText() +"       "+  CurrentPrice.get(2).getText());
		
	}

}
