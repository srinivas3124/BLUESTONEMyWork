package UdemyAssignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calender_generic_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.easemytrip.com/flights.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("ddate")).click();
		while(!driver.findElement(By.cssSelector("div[class='month'] div[class='month2'")).getText().contains("NOV"))
		{
		driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
		}

		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.xpath("//li[@style='visibility:show']")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.xpath("//li[@style='visibility:show']")).get(i).getText();
		if(text.equalsIgnoreCase("8"))
		{
		driver.findElements(By.xpath("//li[@style='visibility:show']")).get(i).click();
		break;
		}

		}

	}

}
