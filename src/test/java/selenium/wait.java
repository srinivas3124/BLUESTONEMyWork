package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wait {

	public static void main(String[] args) {
		implicit_wait();

	}

	private static void implicit_wait() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.of(5, TimeUnit.SECONDS));

		

		
	}

}
