package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		//switchtoframe_by_id();
		//switchtoframe_by_index();
		switchtoframe_by_webelement();
	}

	private static void switchtoframe_by_webelement() throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement iframe_xpath = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(iframe_xpath);
	
		WebElement message_textbox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		Thread.sleep(5000);
		
		message_textbox.clear();
		message_textbox.sendKeys("bluestone");
		Thread.sleep(5000);
		
		message_textbox.clear();
		message_textbox.sendKeys("my name from bluestone");
		
		Thread.sleep(5000);
		driver.close();

		

		
	}

	private static void switch_to_frame_by_index() throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		Thread.sleep(5000);
		driver.switchTo().frame(0);
	
		WebElement message_textbox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		Thread.sleep(5000);
		
		message_textbox.clear();
		message_textbox.sendKeys("bluestone");
		Thread.sleep(5000);
		
		message_textbox.clear();
		message_textbox.sendKeys("my name from bluestone");
		
		Thread.sleep(5000);
		driver.close();

		
	}

	private static void switchtoframe_by_id() throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(5000);
		
		driver.switchTo().frame("mce_0_ifr");
		WebElement message_textbox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		Thread.sleep(5000);
		
		message_textbox.clear();
		message_textbox.sendKeys("bluestone");
		Thread.sleep(5000);
		
		message_textbox.clear();
		message_textbox.sendKeys("my name from bluestone");
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
