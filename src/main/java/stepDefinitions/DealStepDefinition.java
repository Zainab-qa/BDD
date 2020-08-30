package stepDefinitions;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DealStepDefinition {
	
	/*WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_login_page() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\zaina\\\\Desktop\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);
		
	}
	
	@Then("^title of login page is HubSpot Login$")
	public void title_of_login_is_HubSpot_login() throws InterruptedException {
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("HubSpot Login", title);	
	}
	
	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credentials) throws InterruptedException {
		Thread.sleep(3000);
		
		List<List<String>> data = credentials.raw();
	
	    driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));  
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
	    driver.findElement(By.id("loginBtn")).click();
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws InterruptedException{
	  Thread.sleep(3000);
	  String title =  driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals("Account Setup | HubSpot", title);
	}
	
	
	@Then("^user click on new deal$")
	public void user_click_on_new_deals() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-primary-sales-branch\"]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"nav-secondary-deals\"]/div[1]")).click();
	}*/


}
