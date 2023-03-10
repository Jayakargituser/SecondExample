package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {

	
	@Test
	public void loadDiver()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mycontactform.com/");
		
		driver.manage().window().maximize();
		
		driver.close();
		
	}
}
