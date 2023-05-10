package UdemyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String option = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select selectoption = new Select(dropdown);
		selectoption.selectByVisibleText(option);
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String alertdata= driver.switchTo().alert().getText();
		if(alertdata.contains(option)) 
		{
			System.out.println(option);
		}
		else {
			System.out.println("Data not matched");
		}
		
		
		

	}

}
