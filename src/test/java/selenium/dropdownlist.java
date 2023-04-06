package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DOWNLOADS_TESTING\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		//select a value from ssc board
		WebElement SSCBoard_ddl = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		Select board = new Select(SSCBoard_ddl);
		
		board.selectByValue("icse");
		Thread.sleep(2000);
		board.selectByValue("R");
		Thread.sleep(1000);
		
		//select a value from ssc regular/supplementary	
		WebElement SSCRegular_ddl = driver.findElement(By.xpath("//select[@id='userProperties(passType)']"));		
		Select regular = new Select(SSCRegular_ddl);
		
		regular.selectByValue("June");		
		Thread.sleep(2000);				
		regular.selectByValue("March");		
		Thread.sleep(1000);
		
		//select a year of pass
		WebElement yearofpass = driver.findElement(By.xpath("//input[@id='userProperties(sscpassfailyr)']"));
		Thread.sleep(2000);
		yearofpass.sendKeys("2017");
		
		//select a hall ticket no
		WebElement hallticket_no = driver.findElement(By.xpath("//input[@id='userProperties(sscno)']"));
		Thread.sleep(2000);
		hallticket_no.sendKeys("1120108925");
		
		//select a date of birth
		WebElement date_of_birth = driver.findElement(By.xpath("//input[@id='userProperties(passdob)']"));
		Thread.sleep(2000);
		date_of_birth.sendKeys("15/05/1996");
		
		//select a name	
		WebElement name = driver.findElement(By.xpath("//input[@id='youthname']"));		
		Thread.sleep(2000);		
		name.sendKeys("AKKEMSRINIVAS");

				
		//select a father name				
		WebElement father_name = driver.findElement(By.xpath("//input[@id='youthfgname']"));		
		Thread.sleep(2000);		
		father_name.sendKeys("A VENKATA RAMUDU");
		
		//select a gender					
		WebElement GENDER = driver.findElement(By.xpath("//input[@id='gender2']"));		
		Thread.sleep(2000);		
		GENDER.click();
				
		//select aadhar no
		WebElement aadharno = driver.findElement(By.xpath("//input[@id='aadharno']"));		
		Thread.sleep(2000);		
		aadharno.sendKeys("614948658753");

		//select mobile no
		WebElement mobile_no = driver.findElement(By.xpath("//input[@id='userProperties(studentmobileno)']"));		
		Thread.sleep(2000);		
		mobile_no.sendKeys("8886709290");
		
		//select Is children employee or not
		WebElement child_employee = driver.findElement(By.xpath("//input[@id='isEmpChild2']"));		
		Thread.sleep(3000);		
		child_employee.click();
		
		//select email id 
		WebElement email_id = driver.findElement(By.xpath("//input[@id='userProperties(email)']"));	
		js.executeScript("arguments[0].scrollIntoView();", email_id);
		Thread.sleep(2000);		
		email_id.sendKeys("akkemsrinivas@gmail.com");
		
		//upload an image
		
		WebElement photo = driver.findElement(By.xpath("//div[@id='manualupload']"));
		photo.click();
		
		WebElement upload_photo = driver.findElement(By.xpath("//input[@id='studentphoto']"));
        upload_photo.sendKeys("D:\\ORIGINAL CERTIFICATES\\PASSPORT SIZE PHOTO.jpg");
        
        //select district
        WebElement district_ddl = driver.findElement(By.xpath("//select[@id='distId']"));
		
		Select district = new Select(district_ddl);
		
		district.selectByValue("13");
		Thread.sleep(2000);
		
		//select mandal
        WebElement mandal_ddl = driver.findElement(By.xpath("//select[@id='man']"));
		
		Select mandal = new Select(mandal_ddl);
		
		mandal.selectByValue("7");
		Thread.sleep(2000);
		
		//select village
        WebElement village_ddl = driver.findElement(By.xpath("//select[@id='vilId']"));
		
		Select village = new Select(village_ddl);
		
		village.selectByValue("13");
		Thread.sleep(2000);
		
		//select address
		WebElement address = driver.findElement(By.xpath("//textarea[@id='userProperties(addrhouseno)']"));		
		Thread.sleep(2000);		
		address.sendKeys("41-341-2, kothapeta, kurnool");
		
		//select institution district
        WebElement insdistrict_ddl = driver.findElement(By.xpath("//select[@id='instdistname']"));
		
		Select insdistrict = new Select(insdistrict_ddl);
		
		insdistrict.selectByValue("13");
		Thread.sleep(2000);
		
		//select institution mandal
        WebElement insmandal_ddl = driver.findElement(By.xpath("//select[@id='instmndlname']"));
		
		Select insmandal = new Select(insmandal_ddl);
		
		insmandal.selectByValue("7");
		Thread.sleep(2000);
		
		//select institution name
        WebElement insname_ddl = driver.findElement(By.xpath("//select[@id='instcollname']"));
		
		Select insname = new Select(insname_ddl);
		
		insname.selectByValue("12229");
		Thread.sleep(2000);
		
		//select course name
		WebElement coursename_ddl = driver.findElement(By.xpath("//select[@id='instcourseid']"));
		
		Select coursename = new Select(coursename_ddl);
		
		coursename.selectByValue("1283");
		Thread.sleep(2000);
		
		//select course year
		WebElement courseyear_ddl = driver.findElement(By.xpath("//select[@id='instcourseyear']"));
		
		Select courseyear = new Select(courseyear_ddl);
		
		courseyear.selectByValue("4");
		Thread.sleep(2000);
		
		//select admission no
		WebElement admission_no = driver.findElement(By.xpath("//input[@id='userProperties(admissionno)']"));		
		Thread.sleep(2000);		
		admission_no.sendKeys("13@T1a0345");

		
		
		

		

		

		
		



        
     

        		
	}
}
