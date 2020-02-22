package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmanazeer\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://junit.org/junit5/docs/current/api/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int i =1;
	while(driver.findElements(By.xpath("//*[@id='i["+i+"']")).size()==1)
			{
		System.out.println(driver.findElement(By.xpath("//*[@id='i["+i+"']")).getText());	
		i++;
			}
			
	}

}
//*[@id="i0"]
//*[@id="i0"]