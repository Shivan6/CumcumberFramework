package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMSteps {
	
	WebDriver driver;
	@Given("Open CRM application with {string}")
	public void open_crm_application_with(String url) {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	    
	}

	@When("User enters on SignIn link")
	public void user_enters_on_sign_in_link() {
	WebElement slink=driver.findElement(By.linkText("Sign In"));
	if(slink.isDisplayed() && slink.isEnabled())
	{
		slink.click();
	}
	 
	}

	@Then("User should navigate to login page")
	public void user_should_navigate_to_login_page() {
	    String actUrl =driver.getCurrentUrl();
	    Assert.assertTrue(actUrl.contains("login"),"Navigation fail!");
	    System.out.println("User navigated to Login Page!");
	}

	@When("User navigate to login page")
	public void user_navigate_to_login_page() {
	    
		driver.findElement(By.linkText("Sign In")).click();
	}

	@When("User enters valid emaildid {string} and valid password {string}")
	public void user_enters_valid_emaildid_and_valid_password(String email, String pwd) {
	    driver.findElement(By.id("email-id")).sendKeys(email);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("User Should  able to login and navigate to customers page")
	public void user_should_able_to_login_and_navigate_to_customers_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Navigation to Current page fail!");
	    System.out.println("User navigated to custormers page!");
	    
	}


}
