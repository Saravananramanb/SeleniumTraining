package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassWorkWebSiteLanch {

	public static void main(String[] args) {

		// Get Webdrive
		WebDriverManager.chromedriver().setup();
		
		//Object for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Lanch Website
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter Login 
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String tagName = driver.findElement(By.tagName("h2")).getText();
		System.out.println(tagName);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create Lead
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Company Name,FirstName and Surename
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf" );
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravanan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raman");
		
		//Dropdown
		
	WebElement webEle =	driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dropDown = new Select(webEle);
	dropDown.selectByIndex(2);
	
				
		driver.findElement(By.name("submitButton")).click();
		
		String crmTitle =  driver.getTitle();
		System.out.println(crmTitle);
		
		
		if (crmTitle.equals("View Lead | opentaps CRM"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Failed");
		
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyName);
	}

}
