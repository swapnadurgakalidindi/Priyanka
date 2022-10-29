package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public void HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void LogOut() {

		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}