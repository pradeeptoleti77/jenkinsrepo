package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDay2_Css 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://money.rediff.com/gainers");
		  
		  List<WebElement> elements = driver.findElements(By.cssSelector("table[class='dataTable'] >tbody tr:nth-child(3) td"));
		  
		  for(WebElement list:elements)
		  {
			  String item = list.getText();
			  System.out.println(item);
		  }
		  
		  
	
		  driver.quit();
	}

}
