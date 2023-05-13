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

public class paraCucumbe {
	public WebDriver driver;
	@Given("user launch the url as {string}")
	public void user_launch_the_url_as(String us) {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get(us);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String u) 
	{ 
	    WebElement s = driver.findElement(By.name("username"));
	    s.sendKeys(u);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String p)
	{
		WebElement a = driver.findElement(By.name("password"));
	   a.sendKeys(p);
	}

	@When("user clicks the login")
	public void user_clicks_the_login()
	{
	    WebElement lo = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    lo.click();
	}

	@Then("user lands the homepage succesfully")
	public void user_lands_the_homepage_succesfully()
	{
	    System.out.println("the user lands the homepage successfully in OrangeHRM");
	}

}
