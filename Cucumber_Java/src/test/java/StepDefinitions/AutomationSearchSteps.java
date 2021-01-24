package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class AutomationSearchSteps {
	
	WebDriver diver=null;
	
	@Given("Browser will open")
	public void Browser_will_open() {
		System.out.println("inside steps-Browser is open");
		System.setProperty("webdriver.chorme.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		
	}

	@And("User is on Automation home page")
	public void User_is_on_Automation_home_page() {
		System.out.println("inside steps-User is on Automation home page");


	}

	@When("user enter usernameand password")
	public void user_enter_usernameand_password() {
		System.out.println("inside steps-user enter usernameand password");

	}

	@And("Cick on Enter")
	public void Cick_on_Enter() {
		System.out.println("inside steps-Cick on Enter");

	}


	@Then("user navigated to the Search result")
	public void user_navigated_to_the_Search_result() {
		System.out.println("inside steps-user navigated to the Search result");



	}

}
