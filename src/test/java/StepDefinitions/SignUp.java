package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp {
	

	static WebDriver driver;
	
	@Given("user is on Certificate service SignIn")
    public void User_Is_On_SignIn() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://localhost:4200/");
    }

    @And("user clicks on sign-up link")
    public void User_Clicks_On_SignUp_Link() {
    	
        driver.findElement(By.xpath("//a[text()='Sign-up']")).click();
       
    }
   
    @When("the user provides valid registration details in {string}{string}{string}{string}{string} and {string}")
    public void User_Provides_Valid_Registration_Details(String FirstName,String LastName,String UserName,String Email,String Password,String confirmPassword) {
    	
    	//FirstName
    	WebElement fname=driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
    	fname.sendKeys(FirstName);
    	
    	//LastName
    	WebElement lname=driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
    	lname.sendKeys(LastName);
    	
    	//UserName
    	WebElement uname=driver.findElement(By.xpath("//input[@formcontrolname='userName']"));
    	uname.sendKeys(UserName);
    	
    	//Email
    	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
    	email.sendKeys(Email);
    	
    	//Password
    	WebElement pass=driver.findElement(By.xpath("//input[@formcontrolname='password']"));
    	pass.sendKeys(Password);
    	
    	//confirmPassword
    	WebElement conpass=driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']"));
    	conpass.sendKeys(confirmPassword);
    }

    @And("clicks the sign-up button")
    public void Clicks_The_SignUp_Button() {
    	
    	driver.findElement(By.xpath("//button[@class='submit']")).click();
        
    }
    
    @And("redirected to the SignIn page")
    public void Redirected_To_The_SignIn_Page() {
    	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
    }
    	/* 
    

    @When("the user provides incomplete registration details")
    public void whenTheUserProvidesIncompleteRegistrationDetails() {
        
    }

    @Then("error message should be displayed for each incomplete field")
    public void thenErrorMessageShouldBeDisplayedForEachIncompleteField() {
       
    }

    @But("the user should stay on the sign-up page")
    public void butTheUserShouldStayOnTheSignUpPage() {
        
    }

    @When("the user provides invalid registration details")
    public void whenTheUserProvidesInvalidRegistrationDetails() {
        
    }

    @Then("error message should be displayed for each invalid field")
    public void thenErrorMessageShouldBeDisplayedForEachInvalidField() {
        
    }

    @When("the user provides registration details with the existing email")
    public void whenTheUserProvidesDetailsWithExistingEmail() {
       
    }

    @When("the user provides registration details with the existing username")
    public void whenTheUserProvidesDetailsWithExistingUsername() {
       
    }

    @When("the user provides a password less than 8 characters")
    public void whenTheUserProvidesShortPassword() {
       
    }

    @Then("an error message should be displayed")
    public void thenAnErrorMessageShouldBeDisplayed() {
        
    }

    @But("the user should stay on the sign-up page")
    public void butTheUserShouldStayOnTheSignUpPageForErrors() {
       
    } 
    */
}

