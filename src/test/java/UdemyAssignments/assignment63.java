package UdemyAssignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignment63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("ASC");

		driver.findElement(By.name("email")).sendKeys("asc@gmail.com");

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("*******");

		driver.findElement(By.id("exampleCheck1")).click();

		WebElement dd = driver.findElement(By.id("exampleFormControlSelect1"));

		Select ddlist = new Select(dd);

		ddlist.selectByVisibleText("Male");

		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.name("bday")).sendKeys("15/05/1996");

		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();


	}

}
