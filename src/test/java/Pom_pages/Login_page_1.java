package Pom_pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Login_page_1 {
	WebDriver driver;
	@FindBys( {
		   @FindBy(id="username"),
		   @FindBy(id = "password")
		} )
	WebElement uname;
	@FindBy(id = "password")
	WebElement pass;
	@FindBy(id = "login")
	WebElement login;
	//By user_name=By.id("username");
	//By pass=By.id("password");
	//By login=By.id("login");
	

	public Login_page_1(WebDriver driver) {
		super();
		this.driver = driver;
		
		
	}
	public void entername(String nameofuser,String password)
	{
		uname.sendKeys(nameofuser);
		 pass.sendKeys(password);
		 login.click();
	}
	

}
