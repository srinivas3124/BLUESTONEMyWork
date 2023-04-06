package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class instagram_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co);
		
		//launch the url
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		//find the elements
			WebElement username = driver.findElement(By.name("username"));
			Thread.sleep(3000);
			username.sendKeys("8886709290");

			WebElement password = driver.findElement(By.name("password"));
			Thread.sleep(3000);
			password.sendKeys("13@T1a0345");

			//Click on the login button
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			loginButton.click(); 
			Thread.sleep(3000);
			
			/*WebElement home_button = driver.findElement(By.xpath("//div[@class='_aagx']//*[name()='svg']//*[name()='path' and contains(@clip-rule,'evenodd')]"));
	        home_button.click();
	        Thread.sleep(3000);
	        */
			
			
	        
	        WebElement search_button = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]/div[1]"));
	        search_button.click();
	        Thread.sleep(3000);

	        
	        driver.switchTo().alert().accept();
			
	        WebElement like_button = driver.findElement(By.xpath("//*[@id=\"mount_0_0_ND\"]/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div[1]/section/div[1]/div[3]/div/div/div[1]/div/article[1]/div/div[3]/div/div/section[1]/span[1]/button/div[2]/span/svg"));
	        like_button.click();

			driver.close();

	}

}
