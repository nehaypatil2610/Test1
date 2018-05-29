import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffWebTable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Neh@\\Selenium\\Chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

//list of all companies
List<WebElement> allComapnies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

//list of all current prices
List<WebElement> allPrices=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

String company="SREI Infrastructure"; //we need to fetch current price of this copnay

for(int i=0;i<allComapnies.size();i++)//0,1,2
{
	if(allComapnies.get(i).getText().equals(company))
	{
		System.out.println(allPrices.get(i).getText());
	}
}

	}

}
























