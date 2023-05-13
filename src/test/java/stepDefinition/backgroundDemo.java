package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class backgroundDemo {
	WebDriver driver ;
	@Before(order = 0)
	public void startUp()
	{
		 WebDriverManager.chromedriver().setup();
		  driver  = new ChromeDriver();
	}
	@Before(order =1)
	public void launch()
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		
	}
	@Given("the user launches url")
	public void the_user_launches_url() 
	{
	  
	  
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	}

	@When("the user enters the username as {string}")
	public void the_user_enters_the_username_as(String u)
	{
	    WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(u);
		
	}

	@When("the user enters the password as {string}")
	public void the_user_enters_the_password_as(String p)
	{
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(p);
	}

	@When("the user click the login")
	public void the_user_click_the_login()
	{
	    WebElement lo = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    lo.click();
	}

	@Then("user successfully login the homepage")
	public void user_successfully_login_the_homepage() 
	{
	    String text = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
	    
	    if(text.equals("Dashboard"))
	    {
	    	
	    	System.out.println("this is valid statement ");
	    }
	    else
	    {
	    	
	    	System.out.println("this is not valid statement ");
	    }
	}
	   @After(order = 1)
	public void tear()
	{
		
		System.out.println("this is new formate");
	}
	@After(order = 0)
	public void down()
	{
		
		System.out.println("this is another fofrrmate");
	}
	
	}

	
	
	
	
	


