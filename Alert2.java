package week2.days5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//Simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert first=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(first.getText());
		first.accept();
		
		//Confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert second=driver.switchTo().alert();
		Thread.sleep(3000);
		second.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert third=driver.switchTo().alert();
		third.sendKeys("Raj Vignesh");
		Thread.sleep(3000);
		System.out.println(third.getText());
		third.accept();

	}

}
