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
		

	}

}
