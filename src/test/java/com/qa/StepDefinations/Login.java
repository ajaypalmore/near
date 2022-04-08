package com.qa.StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Login {

	WebDriver driver;

	@Given("^User has a Near account in the web browser$")
	public void Open_Near_Account_Page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().browserVersion("98.0.4758.102").setup();
		WebDriverManager.chromedriver().driverVersion("98.0.4758.102").setup();
		//System.setProperty("webdriver.chrome.driver","C:\\workspace\\near\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing.mtvrs.app/");

	}

	@And("^User is on the Sign-in page$")
	public void Verify_Sign_Page() throws Throwable {
		String xPathWithVariable = "(//a[contains(text(),'Sign Up')])[0]";
		Assert.assertEquals("Sign Up", driver.findElement(By.xpath(xPathWithVariable)).getText());

	}

	@When("^User Clicks on Sign Up$")
	public void User_Clicks_Sign_Up() {
		driver.findElement(By.xpath("(//a[contains(text(),'Sign Up')])[0]")).click();
	}

	@And("^User lands on How it works page$")
	public void User_lands_on_How_it_works_page() {
		Assert.assertEquals("HOW IT WORKS", driver.findElement(By.xpath("//h1[text()='HOW IT WORKS']")).getText());
	}

	@And("^User Clicks on CREATE YOUR ACCOUNT button$")
	public void User_Create_Account_Click() {
		driver.findElement(By.xpath("//p[tex()='CREATE YOUR ACCOUNT']")).click();
	}

	@And("^User lands on Welcome to Mtvrs page$")
	public void Welcome_MTVRS() {
		Assert.assertEquals("ENTER YOUR EMAIL ADDRESS",driver.findElement(By.xpath("//p[text()='ENTER YOUR EMAIL ADDRESS']")).getText());
	}

	@And("^User enters valid email address \"(.*)\"$")
	public void user_enter_vaild_email(String email) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(email);
	}

	@And("^User enters a valid username \"(.*)\"$")
	public void user_enters_username(String username) {
		driver.findElement(By.xpath("//input[@type='text'and @class='MuiInputBase-input MuiInput-input']")).sendKeys(username);
	}

	@And("^User enters valid password \"(.*)\"$")
	public void user_enters_password(String password) {
		driver.findElement(By.xpath("//input[@id='standard-adornment-password']")).sendKeys(password);
	}
	
	@And("^User enters comfirm password \"(.*)\"$")
	public void user_enters_confirm_password(String password) {
		driver.findElement(By.xpath("//input[@id='standard-adornment-password']")).sendKeys(password);
	}
	
	@And("^User clicks on Connect your NEAR account$")
	public void user_clicks_Connect_your_NEAR_account() {
		driver.findElement(By.xpath("//button[@type='button']"));
	}

	@And("^User clicks on Continue$")
	public void user_clicks_continue() {
		driver.findElement(By.xpath("//input[@type='submit']"));
	}

	@And("^Close Browser$")
	public void Close_Browser() throws Throwable {
		driver.quit();
	}

	@And("^you are in And annotation$")
	public void and_() throws Throwable {
	}

}
