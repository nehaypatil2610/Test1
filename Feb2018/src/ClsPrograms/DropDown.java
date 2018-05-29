package ClsPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Bipin\\Chrome driver 2.30\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?src=fp&intl=in&lang=en-IN&done=https%3A%2F%2Fmail.yahoo.com&specId=yidReg");

		WebElement dropDown=driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
					
		//How to automate drop down using Select class
		Select s = new Select(dropDown);
		//s.selectByIndex(9);
		//s.selectByVisibleText("September");
		s.selectByValue("9");

		System.out.println(s.isMultiple());
		
		
		s.selectByVisibleText("September");
		s.selectByVisibleText("April");
	}

}

















