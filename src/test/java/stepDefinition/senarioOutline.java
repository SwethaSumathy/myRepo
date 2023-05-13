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

public class senarioOutline {
	public WebDriver driver;
	@Given("user launches  url")
	public void user_launches_url() 
	{
		WebDriverManager .chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enters  username as {string}")
	public void user_enters_username_as(String us)
	{
		 WebElement s = driver.findElement(By.name("username"));
		    s.sendKeys(us);
	}

	@When("user enters  password as {string}")
	public void user_enters_password_as(String ps)
	{
		WebElement a = driver.findElement(By.name("password"));
		   a.sendKeys(ps);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button()
	{
		WebElement lo = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    lo.click();
	}

	@Then("user launch the homepage")
	public void user_launch_the_homepage() 
	{
	   System.out.println("user launches the homepage succesfully");
	}


}
