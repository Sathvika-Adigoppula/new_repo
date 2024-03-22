package Pom_Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pom_pages.Login_page_1;

public class Test_Case_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		Login_page_1 lpo=PageFactory.initElements(driver,Login_page_1.class);
		lpo.entername("vasvupeg","vasu1234");
		System.out.println("");
		
				

	}

}
