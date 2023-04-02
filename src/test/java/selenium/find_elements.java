package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class find_elements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		//find single web element
		WebElement single = driver.findElement(By.xpath("//table[@class='dataTable']//tr"));
		
		//find list of web elements or multiple web elements
		List<WebElement> allelements = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		int count = allelements.size();
		System.out.println("Number of Elements in List = " + count);
		
		Thread.sleep(5000);
		driver.close();
		
		
		


	 }

}
