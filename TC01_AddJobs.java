package OrangeHrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_AddJobs {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	}
  @Test
  public void Jobs() {
	  
	  LoginPage l1=new LoginPage();
	  l1.LoginPage(driver);
	  l1.Login();
	  
	  
	  JobsPage j1=new JobsPage();
	  j1.JobsPage(driver);
	  j1.AddJob();
	  
	  HomePage h1=new HomePage();
	  h1.HomePage(driver);
	  h1.LogOut();
	  
	  
  }
  @AfterTest
  public void CloseBrowser() {
	  driver.close();
  }
}
