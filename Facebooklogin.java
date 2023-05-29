package weekDayAssesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement loginButton=Driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
		loginButton.click();
		
		WebElement firstName=Driver.findElement(By.name("firstname"));
		firstName.sendKeys("Raj");
		
		WebElement secondName=Driver.findElement(By.name("lastname"));
		secondName.sendKeys("Vignesh");
		
		WebElement enterMailId=Driver.findElement(By.name("reg_email__"));
		enterMailId.sendKeys("rajvignesh25122gmail.com");
		
		WebElement enterPassword=Driver.findElement(By.id("password_step_input"));
		enterPassword.sendKeys("Grt54783");
		
		WebElement day=Driver.findElement(By.id("day"));
		Select day1=new Select(day);
		
		day1.selectByVisibleText("25");
		WebElement month=Driver.findElement(By.id("month"));
		
		Select month1=new Select(month);
		month1.selectByVisibleText("Dec");
		
		WebElement year=Driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1999");
		
		WebElement select=Driver.findElement(By.xpath("//input[@value='2']"));
		select.click();
		
		

	}

}
