package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadimage {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		WebElement email_id = driver.findElement(By.xpath("//input[@id='userProperties(email)']"));	
		js.executeScript("arguments[0].scrollIntoView();", email_id);
		Thread.sleep(2000);		
		email_id.sendKeys("akkemsrinivas@gmail.com");
		
		//upload an image
		
		WebElement photo = driver.findElement(By.xpath("//div[@id='manualupload']"));
		photo.click();
		
		WebElement upload_photo = driver.findElement(By.xpath("//input[@id='studentphoto']"));
        upload_photo.sendKeys("D:\\ORIGINAL CERTIFICATES\\PASSPORT SIZE PHOTO.jpg");
        
        Thread.sleep(2000);
        driver.close();

	}

}
