package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("Load the application url")
	public void loadApplication() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@Given("Enter the username as {string}") 
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@Given("Enter the password as {string}")
	public void enter_the_password_as(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	
	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Homepage is displayed");
		} else {
			System.out.println("Homepage is not displayed");
		}
	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed(); // true / false
		if(displayed) {
			System.out.println("Error message is displayed");
		}else {
			System.out.println("Error message is not displayed");
			
		}

	}

	//@But("Error message should be displayed")
	//public void verifyErrorMessage() {
		//boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed(); //true/false
		//if(displayed) {
			//System.out.println("Error message is displayed");
		//} else {
			//System.out.println("Error message is not displayed");
		//}

	//}
}


