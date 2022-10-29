package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NationalityPage {
	WebDriver driver;

	public void NationalityPage(WebDriver driver) {
		this.driver=driver;
	}
	public void AddNation() {
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.linkText("Nationalities")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input--active')])[2]")).sendKeys("India69699");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
