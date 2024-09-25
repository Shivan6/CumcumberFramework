package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hrmsteps {
	
	WebDriver driver;
	
	@Given("Open enters Username and enters password")
	public void open_enters_username_and_enters_password() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters\"<username>\" and enters {string}")
	public void user_enters_username_and_enters(String un, String pwd) {
	    driver.findElement(By.name("username")).sendKeys(un);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("As per valid data set user should be navigated to dashboard")
	public void as_per_valid_data_set_user_should_be_navigated_to_dashboard() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"login Fail");
	   System.out.println("Login is pass");
	}


}
