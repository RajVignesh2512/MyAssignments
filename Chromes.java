package week2.days5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the window
		driver.manage().window().maximize();
		//Enter the user name
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		//Enter the password
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		//click the login button
		WebElement loginButton=driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		//click on CRM/SFA Link
		WebElement crmsfa=driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		//click on leads Button
		WebElement leadsTab=driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		//click on create lead
		WebElement createLead=driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		//Enter the company name
		WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testleaf");
		//Enter the first name
		WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Raj");
		//Enter the last name
		WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Vignesh");
		//Enter the firstnameLocal
		WebElement firstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("buddy");
		//Enter the lastNameLocal
		WebElement lastNameLocal=driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastNameLocal.sendKeys("vicky");
		//Enter the department
		WebElement department=driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("Compuer Science");
		//Enter the description
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Education is most powerfull weapon we can use change the world");
		//Enter the email ID
		WebElement emailId=driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailId.sendKeys("rajvignesh2512@gmail.com");
		//Click on submit Button
		WebElement clickSubmitButton=driver.findElement(By.className("smallSubmit"));
		clickSubmitButton.click();
		//close the browser
		driver.close();
	}

}
