package Selenium_Libraries;

import org.openqa.selenium.*;
import Selenium_Libraries.CommonPages;
//import Libraries.*;


public class ActiLibrary extends CommonPages
{
	
	static By UserName = By.xpath("//table[@class='login']//table[@class='textFieldsTable']//input[@name='username']");
	
	static By Password = By.xpath("//table[@class='login']//table[@class='textFieldsTable']//input[@name='pwd']");
	
	static By Login = By.xpath("//td[@id='loginButtonContainer']/a/div[contains(text(),'Login')]");
	
	
	//This Method is used to Login to Application
	public static void login(String loginType)
	{
		enter_text_value("user_name", UserName, userName);
		
		enter_text_value("pass_word", Password, password);
		
		clickButton("Login Button", Login);
	}
			
	
	
	static By logout = By.xpath("//a[text()='Logout']");
	
	//This Method is used to Logout from Application
	public static void logout()
	{
		fixed_wait_time(1);
		clickButton("Logout Button",logout);
		
		waitFor(logout);
		
		if(IsElementDisplayed("Logout Button", logout))
			System.out.println("Logout Successfully logged out of portal");
	}
}
