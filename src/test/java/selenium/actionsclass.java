package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionsclass {

	public static void main(String[] args) throws InterruptedException {
		Right_click();
		double_click();
		hover_img();
		drag_drop();
	}

	private static void drag_drop() throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		
		WebElement iframe_xpath = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe_xpath);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(5000);
		System.out.println();
		
		driver.close();
	}

	private static void hover_img() throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");
		
		WebElement hover = driver.findElement(By.xpath("//img[@alt='User Avatar']"));
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(hover).build().perform();
		Thread.sleep(5000);
		
		driver.close();
	}

	private static void double_click() throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		driver.manage().window().maximize();
		driver.get("https://mousetester.com/");
		Thread.sleep(5000);
		
		WebElement click = driver.findElement(By.xpath("//div[@id='clickMe']"));
		Thread.sleep(5000);
		
		Actions doubleclick_me = new Actions(driver);
		doubleclick_me.doubleClick(click).build().perform();
		Thread.sleep(5000);

		driver.close();
		
	}

	private static void Right_click() throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); 
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		Thread.sleep(5000);
		
		WebElement rectangle_area = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Thread.sleep(5000);
		
		//actions for left click
		Actions rectangle = new Actions(driver);
		rectangle.contextClick(rectangle_area).build().perform();
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.close();		
	}

}
