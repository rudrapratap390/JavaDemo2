package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;

public class LoginStepDefinition {
	
	public  WebDriver driver;

@Given("^user on the login page$")
public void user_on_the_login_page() {
	
	System.setProperty("webdriver.ie.driver","C:\\Users\\Miraj Kumar\\Desktop\\Rudra Notes\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	
	driver.get("https://www.toolsqa.com/");
	
	//driver.close();
	
	
	

}
/*
@When("^user enter valid user Id and Password$")
public void user_enter_valid_user_Id_and_Password() {
	System.out.println();

}

@When("^user click on the login button$")
public void user_click_on_the_login_button(){
	System.out.println();

}

@Then("^user is on home page$")
public void user_is_on_home_page(){
	System.out.println();
   
}
*/


}
