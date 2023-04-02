package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alerthandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(5000);
		//String Expected_message = "Customer Successfully Delete!" ;
		
		WebElement customerid_textbox		= driver.findElement(By.xpath("//input[@name='cusid']"));
		Thread.sleep(5000);
		customerid_textbox.sendKeys("8886709290");
		
		
		WebElement Submit_button			= driver.findElement(By.xpath("//input[@name='submit']"));
		Thread.sleep(5000);
		Submit_button.click();
		
		//using alerts
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String Actual_message = driver.switchTo().alert().getText();
		System.out.println(Actual_message);
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
