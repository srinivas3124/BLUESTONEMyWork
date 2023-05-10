package UdemyAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		driver.get("http://the-internet.herokuapp.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowsindex = windows.iterator();
		String parentid = windowsindex.next();
		String childid = windowsindex.next();
		driver.switchTo().window(childid);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	
		driver.switchTo().window(parentid);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
		


		

	}

}
