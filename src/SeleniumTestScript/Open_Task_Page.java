package SeleniumTestScript;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Selenium_Libraries.ActiLibrary;
import Selenium_Libraries.Browser;
import Selenium_MainScript.Create_Tasks;

public class Open_Task_Page extends Create_Tasks
{	
	
	

@BeforeClass
public void Launch()
{
   /* WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
    driver.get("http://localhost/login.do");*/
    
	Browser.Browse();
}

@BeforeMethod
public void Login()
{
	ActiLibrary.login(userName);
}

@Test()
public void openTaskTitle()
{
    Create_Tasks.openTaskModule();
}

@AfterMethod
public void Logout()
{
	ActiLibrary.logout();
}
 
@AfterClass
public void Quit()
{
	driver.close();
}

}