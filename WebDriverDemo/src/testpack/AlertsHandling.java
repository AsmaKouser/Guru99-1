package testpack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmanazeer\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		/*driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		a.dismiss();
		Thread.sleep(3000);
		driver.close();*/
		
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("asma");
		a.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
