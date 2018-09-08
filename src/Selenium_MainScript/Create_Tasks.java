package Selenium_MainScript;

import org.openqa.selenium.By;
import Selenium_Libraries.*;

public class Create_Tasks extends ActiLibrary
{
	
	static By OpentaskButton = By.xpath("//div[@id='container']//div[@class='navBg']//table/tbody/tr[1]/td[5]/a//img[@width='84']");
	
	static By OpenTaskText = By.xpath("//div[@id='container']//table[@width='100%']/tbody/tr[1]//td[contains(text(),'Open Tasks')]");
	
	//This Method is used to click on Open Task and validating.
	public static void openTaskModule()
	{
		clickButton("Open Tasks", OpentaskButton);
		
		if(IsElementDisplayed("Open Task Text", OpenTaskText))
		
			System.out.println("Click on Open Tasks Module and verify that Open Tasks Page is displayed : Pass");
		else
			System.out.println("Click on Open Tasks Module and verify that Open Tasks Page is  Not displayed : Fail");
	}
	
	
}
	
/*public static void main(String[] args) throws InterruptedException
{
WebDriver driver = new FirefoxDriver();
driver.get("http://localhost/login.do");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.id("username")).sendKeys("manoj");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("raj12345");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
Thread.sleep(3000);

WebElement we = driver.findElement(By.xpath("//div[@id='container']//table[@id='topnav']/tbody/tr[1]/td[5]/a/img[@class='sizer']"));

Actions act = new Actions(driver);
act.moveToElement(we);
Thread.sleep(5000);
act.click(we).build().perform();


String expectedTitle="Open Tasks";
String actualTitle = driver.findElement(By.xpath("//div[@id='container']//table[@class='mainContentPadding rightPadding']//form[@id='filterForm']//table/tbody/tr[1]/td[contains(text(),'Open Tasks')]")).getText();
if(actualTitle.equals(expectedTitle))
{
    System.out.println("Open Tasks Title displayed");
}
else
{
    System.out.println("Open Tasks Title not displayed");
}

WebElement wb =  driver.findElement(By.xpath("//div[@id='container']//table[@class='mainContentPadding rightPadding']//form[@id='filterForm']//div[@id='ext-gen33']"));
act.moveToElement(wb).build().perform();
act.click(wb).build().perform();
Thread.sleep(5000);

String exp = "Create New Tasks";
String actu = driver.findElement(By.xpath("//div[@id='container']//form[@name='AddNewTasksForm']//table/tbody/tr/td[contains(@class,'mainContentPadding rightPadding')]//table/tbody/tr/td[contains(text(),'Create New Tasks')]")).getText();
if(actu.equals(exp.trim()))
{
   System.out.println("Create New Tasks Title displayed");
}
else
{
   System.out.println("Create New Tasks Title not displayed");
}

WebElement wt = driver.findElement(By.xpath("//div[@id='container']//form[@name='AddNewTasksForm']//td[@class='mainContentPadding rightPadding']//select[@name='customerId']"));
Select sel = new Select(wt);
sel.selectByIndex(1);
}	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	

