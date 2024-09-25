package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {
	
	WebDriver driver;
	String title;

	@Given("Open amazon application with url {string}")
	public void open_amazon_application_with_url(String url) {
	   driver =new ChromeDriver();
	   driver.get(url);
	}

	@When("user get the title for amazon home page")
	public void user_get_the_title_for_amazon_home_page() {
	 title=driver.getTitle();
	}

	@Then("title should matched with amazon home page")
	public void title_should_matched_with_amazon_home_page() {
	 Assert.assertTrue(title.contains("India"),"Title is not matched!....Test is fail");
	 System.out.println("title is matched: "+title);
	}

	@When("user click on bestseller option link")
	public void user_click_on_bestseller_option_link() {
	 driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("user get the title of bestseller page")
	public void user_get_the_title_of_bestseller_page() {
		title=driver.getTitle();
	}

	@Then("title should matched with bestsellers title")
	public void title_should_matched_with_bestsellers_title() {
		Assert.assertTrue(title.contains("Bestsellers"),"Title is not matched!....Test is fail");
		 System.out.println("title is matched: "+title);
	   
	}

	@When("User click on Mobile option link")
	public void user_click_on_mobile_option_link() {
		driver.findElement(By.linkText("Mobiles")).click();	
	}

	@When("User get the title of mobile paage")
	public void user_get_the_title_of_mobile_paage() {
		title=driver.getTitle();
	}

	@Then("title  should matched with Mobile title")
	public void title_should_matched_with_mobile_title() {
		Assert.assertTrue(title.contains("Phones"),"Title is not matched!....Test is fail");
		 System.out.println("title is matched: "+title);
	}



}
