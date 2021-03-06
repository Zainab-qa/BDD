package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactsStepWithMap {
	
    WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\zaina\\\\Desktop\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);
	}
	
	@When("^title of login page is HubSpot Login$")
	public void title_of_login_page_is_hubspot_login() throws InterruptedException {
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("HubSpot Login", title);	
	}
	
	
	@Then("^user enter login details$")
	public void user_enter_login_details(DataTable credentials) throws InterruptedException{
		Thread.sleep(3000);
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.id("username")).sendKeys(data.get("username"));
			driver.findElement(By.id("password")).sendKeys(data.get("password"));
			
		}
		
		
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
	
	
	@Then("^user click on new contact option$")
	public void user_click_on_new_contact_option() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-primary-contacts-branch\"]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Contacts']/ul/li/a")).click();
	}

	@Then("^user enter contact detail$")
	public void user_enter_contact_detail(DataTable dealData) throws InterruptedException{
		
		
		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
		
		
		Thread.sleep(3000);
		WebElement loginBtn =  driver.findElement(By.xpath("//button[@data-onboarding=\"new-object-button\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-field='email']")).sendKeys(data.get("email"));
		driver.findElement(By.xpath("//input[@data-field='firstname']")).sendKeys(data.get("firstname"));
		driver.findElement(By.xpath("//input[@data-field='lastname']")).sendKeys(data.get("lastname"));
		driver.findElement(By.xpath("//div[@class='media private-media private-media--align-middle']/div/ul/li/button")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		}
	}
	
	@Then("^close the browser$")
	public void then_close_the_browser() throws InterruptedException {
		driver.close();
	}
	
	


}
