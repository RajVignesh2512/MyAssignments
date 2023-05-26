package weekDayAssesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.tamilmatrimony.in/");
		Driver.manage().window().maximize();
		WebElement profileSelect=Driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select profile=new Select(profileSelect);
		profile.selectByValue("Myself");
		WebElement enterName=Driver.findElement(By.id("NAME"));
		enterName.sendKeys("Vignesh");
		WebElement select=Driver.findElement(By.xpath("//input[@id='gendermale']"));
		select.click();
		WebElement date=Driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select date1=new Select(date);
		date1.selectByVisibleText("25");
		WebElement month=Driver.findElement(By.id("DOBMONTH"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Dec");
		WebElement year=Driver.findElement(By.id("DOBYEAR"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1999");
		WebElement religion=Driver.findElement(By.id("RELIGION"));
		Select religion1=new Select(religion);
		religion1.selectByVisibleText("Hindu");
		WebElement motherTongue=Driver.findElement(By.id("MOTHERTONGUE"));
		Select motherTongue1=new Select(motherTongue);
		motherTongue1.selectByVisibleText("Tamil");
		WebElement country=Driver.findElement(By.id("COUNTRY"));
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
		WebElement enterMobilenumber=Driver.findElement(By.id("MOBILENO"));
		enterMobilenumber.sendKeys("985674356");
		WebElement enterMailId=Driver.findElement(By.id("EMAIL"));
		enterMobilenumber.sendKeys("rajvignesh2512@gmail.com");
		
		

	}

}
