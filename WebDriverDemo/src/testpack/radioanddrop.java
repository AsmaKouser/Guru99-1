package testpack;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radioanddrop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asmanazeer\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		//select passenger count 
		
		Select count =new Select(driver.findElement((By.name("passCount"))));
		count.selectByVisibleText("4");
		
		//print the option
		
		List<WebElement>choices=count.getOptions();
		
		//read
		
		for(int i=0;i<choices.size();i++)
		{
			System.out.println(choices.get(i).getText());
		}
		
		
		
		//select values from dropdown
		Select from=new Select (driver.findElement(By.name("fromPort")));
		from.selectByVisibleText("London");
		
		//print all options from drop down
		List<WebElement> options=from.getOptions();
		
		//read options from dropdown
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		

		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}


}
