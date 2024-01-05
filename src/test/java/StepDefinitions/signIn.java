package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signIn {
	static WebDriver driver;

@Given("user is on Certificate SignIn page")
public void user_is_on_certificate_sign_in_page() {
	 driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://localhost:4200/");
}

@When("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
	 
	//UserName
    WebElement User=driver.findElement(By.xpath("//input[@formcontrolname='userName']"));
    User.sendKeys(username);
    
    //Password
    WebElement pass=driver.findElement(By.xpath("//input[@formcontrolname='password']"));
    pass.sendKeys(password);
}

@When("clicks on SignIn button")
public void clicks_on_sign_in_button() {
	 driver.findElement(By.xpath("//button[text()='Sign-in']")).click();
}

@Then("homepage is displayed")
public void homepage_is_displayed() {
	System.out.println("Successful signIn");
    driver.close();
}
}
