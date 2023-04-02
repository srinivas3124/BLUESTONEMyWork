package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.of(0, null));
			
		//launch the url
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//find the elements
		WebElement  UserID = driver.findElement(By.xpath("//input[@id='email']"));
		//Thread.sleep(2000);
		UserID.sendKeys("8886709290");
		
		WebElement  Password = driver.findElement(By.xpath("//input[@id='pass']"));
		//Thread.sleep(2000);
		Password.sendKeys("13@T1a0345");
		
		WebElement  login = driver.findElement(By.xpath("//button[@type='submit']"));
		//Thread.sleep(2000);
		login.click();
		
		
		driver.switchTo().alert().accept();
		
		Alert alert = driver.switchTo().alert();
        
        // Click the "Allow" button
        alert.accept();
        
        //Click the "Block" button
        alert.dismiss();
        
        // Switch back to the main window
        driver.switchTo().defaultContent();	
        
		WebElement  profile_img = driver.findElement(By.xpath("//body/div[@id='mount_0_0_uw']/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]"));
		Thread.sleep(2000);
		profile_img.click();
		
		WebElement  logout = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
		Thread.sleep(2000);
		logout.click();

		
		//close the driver
		Thread.sleep(5000);
		
		
		
		driver.close();
			
	}

}
