package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver=null;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("inside step-Browser is open");
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("User is on Google search page")
	public void user_is_on_google_search_page() {
		System.out.println("inside step-User is on Google search page");
		
		driver.navigate().to("https://www.google.com");

	}

	@When("user enter a text in search box") 
	public void user_enter_a_text_in_search_box() {
		System.out.println("inside step-user enter a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

	}

	@And("Cick on Enter")
	public void cick_on_enter() throws InterruptedException {
		System.out.println("inside step-Browser is open");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}

	@Then("user navigated to the Search result")
	public void user_navigated_to_the_search_result() throws InterruptedException {
		System.out.println("inside step-Cick on Enter");
		
		driver.getPageSource().contains("Online Courses");
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();

	}



}
