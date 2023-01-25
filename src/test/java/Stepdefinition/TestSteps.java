package Stepdefinition;

import GenericUtils.DriverUtils;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TestSteps {
	LoginPage page = new LoginPage();
	@Given("open URL")
	public void open_url() {
		 DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("Enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
		page.enterUsername(string);
		 page.enterPassword(string2);
	   
	}

	@When("click on Login button")
	public void click_on_login_button() {
		page.clickLogin();
	    
	}

	@Then("Login Successful")
	public void login_successful() {
		 System.out.println("LOGIN SUCCESSFUL");
	   
}
}