package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobsPage {
	WebDriver driver;

	public void JobsPage(WebDriver driver) {
		this.driver=driver;
	}
	public void AddJob() {
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		driver.findElement(By.linkText("Job Titles")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("seniorTester");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
}
