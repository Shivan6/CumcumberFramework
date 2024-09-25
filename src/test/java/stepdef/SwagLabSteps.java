package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import apphooks.SwagLabsHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BrowserProvider;

public class SwagLabSteps   {
	/*
	 * Hooks into stepdef
	 * create seperate class and use hooks
	 * 
	 */
	WebDriver driver=BrowserProvider.getDriver();
	/*
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	*/
	String title;
	@Given("Open SwagLab application with url {string}")
	public void open_swag_lab_application_with_url(String url) {
		
		driver.get("https://www.saucedemo.com/");
	}

//@Given("Open Swaglab application with url")
//	public void open_swag_lab_application() {
//		driver.get("https://www.saucedemo.com/");
//	   
//	}

	@When("User get the title of swaglab homepage title")
	public void user_get_the_title_of_swaglab_homepage_title() {
		title=driver.getTitle();
	   
	}

	@Then("Title should matched with swaglab homepage title")
	public void title_should_matched_with_swaglab_homepage_title() {
	    Assert.assertTrue(title.contains("Labs"),"Title is not matched");
	    System.out.println("Title is matched");
	    
	}

	@When("User enter {string} into username text box and {string} into password")
	public void user_enter_into_username_text_box_and_into_password(String un, String pwd) {
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}

	@When("User click on swaglab login button")
	public void user_click_on_swaglab_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("user should able to navigate Inventory Page")
	public void user_should_able_to_navigate_inventory_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"login fail");
		System.out.println("Login Completed");
	   
	}




}
