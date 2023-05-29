package week3.say1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.tamilmatrimony.in/");
		Driver.manage().window().maximize();
		
		WebElement selectMyself = Driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		
		//WebElement selectMyself = Driver.findElement(By.id("REGISTERED_BY"));
		Select Myself=new Select(selectMyself);
		Myself.selectByValue("1");
		
		WebElement selectname = Driver.findElement(By.xpath("//input[@id='NAME']"));
		
		//WebElement selectname = Driver.findElement(By.id("NAME"));
		selectname.sendKeys("Raj vignesh");
		
		WebElement male = Driver.findElement(By.xpath("//input[@id='gendermale']"));
		
		//WebElement male = Driver.findElement(By.id("gendermale"));
		male.click();
		
		WebElement selectDay = Driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		
		//WebElement selectDay = Driver.findElement(By.id("DOBDAY"));
		Select Day=new Select(selectDay);
		Day.selectByValue("25");
		
		WebElement selectMonth = Driver.findElement(By.id("DOBMONTH"));
		Select Month=new Select(selectMonth);
		Month.selectByValue("12");
		
		//Select the year
		
		WebElement selectyear = Driver.findElement(By.id("DOBYEAR"));
		Select Year=new Select(selectyear);
		Year.selectByValue("1999");
		
		//Select Religion
		
		WebElement selectReligion = Driver.findElement(By.id("RELIGION"));
		Select Religion = new Select(selectReligion);
		Religion.selectByValue("1");
		
		WebElement motherTongue = Driver.findElement(By.id("MOTHERTONGUE"));
		Select Language=new Select(motherTongue);
		Language.selectByValue("47");
		
		WebElement selectCast = Driver.findElement(By.id("CASTE_NORMAL"));
		Select Cast = new Select(selectCast);
		Cast.selectByValue("229");
		
		WebElement selectCountry = Driver.findElement(By.id("COUNTRY"));
		Select Country=new Select(selectCountry);
		Country.selectByValue("185");
		
		WebElement enterMobileNo = Driver.findElement(By.id("MOBILENO"));
		enterMobileNo.sendKeys("533214918");
		
		WebElement enterMailId = Driver.findElement(By.id("EMAIL"));
		enterMailId.sendKeys("rajvignesh2512@gmail.com");
		
		WebElement enterpassword = Driver.findElement(By.xpath("//input[@id='PASSWORD'][@name='PASSWD1']"));
		enterpassword.sendKeys("vignesh");

	}

}
