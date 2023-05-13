package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cucumberLogin {
	WebDriver driver;
	@Given("user launches the url")
	public void user_launches_the_url() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		WebElement user = driver.findElement(By.name("username"));
	    user.sendKeys("Admin");
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		WebElement pass = driver.findElement(By.name("password"));
	    pass.sendKeys("admin123");
	}

	@When("user click the login")
	public void user_click_the_login() {
		WebElement lo = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	   lo.click();
	}

	@Then("user lands the homepage")
	public void user_lands_the_homepage() {
		System.out.println("lauches successfully");
	    
	}


}
