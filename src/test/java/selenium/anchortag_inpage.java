package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class anchortag_inpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		//find list of web elements or multiple web elements
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
		List<WebElement> anchortags = driver.findElements(By.xpath("//a"));
		
		int row_count = rows.size();
		int column_count = column.size();
		int number_anchor = anchortags.size();
		
		System.out.println("Total row count = " + row_count);
		System.out.println("Total column count = " + column_count);
		System.out.println("Total anchor tags count = " + number_anchor);
		Thread.sleep(5000);
		
		for(int i=1;i<row_count;i++)
		{
			for(int j=1;j<column_count;j++)		
			{		
				WebElement texthdil = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
				String text = texthdil.getText();
				if(text.equals("hdil")) {
					
					System.out.println("found word in row " +i+ "column " +j+ ":" +text );
				}
				else {
					System.out.println("word is not found");	
				}			
			}		
		}
		
		Thread.sleep(5000);
		driver.close();
				
	}

}
