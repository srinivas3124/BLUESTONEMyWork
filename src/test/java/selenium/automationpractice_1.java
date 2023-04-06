package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class automationpractice_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		//select a value from web element
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		js.executeScript("arguments[0].scrollIntoView();", firstname);
		
		Thread.sleep(5000);
		firstname.sendKeys("akkem");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		Thread.sleep(5000);
		lastname.sendKeys("srinivas");
		
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		
		Thread.sleep(5000);
		male.click();
		
		WebElement experience = driver.findElement(By.xpath("//input[@value='7']"));
		
		Thread.sleep(5000);
		experience.click();
		
		WebElement date = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
		
		Thread.sleep(5000);
		date.sendKeys("29-03-2023");
		
		WebElement profession = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		
		Thread.sleep(5000);
		profession.click();
		
		WebElement flavours_of_selenium = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		
		Thread.sleep(5000);
		flavours_of_selenium.click();
		
		WebElement continents = driver.findElement(By.xpath("//select[@name='continents']"));
		
		Thread.sleep(5000);
		
		Select continent = new Select(continents);
		
		continent.selectByVisibleText("Australia");
		
		
		WebElement selenium_commands = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		Thread.sleep(5000);
		
		Select mutiple_command = new Select(selenium_commands);
		
		mutiple_command.selectByVisibleText("Browser Commands");
		mutiple_command.selectByVisibleText("Navigation Commands");
		mutiple_command.selectByVisibleText("Wait Commands");
		
		Thread.sleep(5000);
		driver.close();
	}

}
