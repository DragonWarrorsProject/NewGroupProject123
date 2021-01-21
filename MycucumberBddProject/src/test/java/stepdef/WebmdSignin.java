package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;

public class WebmdSignin {
	WebDriver driver=null;
	
	
	
	@Given("I am in webmd rx page")
	public void i_am_in_webmd_rx_page() {
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.webmd.com/rx");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("click on My Account")
	public void click_on_My_Account() {
		WebElement myaccount=driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[10]/div/div[1]/ul/li[4]/a"));

		myaccount.click();
	    
	}

	@When("I enter my email\"<warroirsdragon@gmail.com>\"")
	public void i_enter_my_email_warroirsdragon_gmail_com() {
	   
		WebElement signinemail=driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div/div/div/form/fieldset/div[2]/div[1]/input"));

		signinemail.sendKeys("warroirsdragon@gmail.com");
	}

	@When("I enter my password\"<Talentech123456>\"")
	public void i_enter_my_password_Talentech123456() {
	   
		WebElement signinpassword=driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div/div/div/form/fieldset/div[3]/div[1]/input"));

		signinpassword.sendKeys("Talentech123456");
	}

	@When("I click on sign in button")
	public void i_click_on_sign_in_button() {
	   
		WebElement signinbutton=driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div/div/div/form/fieldset/div[6]/span[1]/input"));
	signinbutton.click();
	}

	@Then("I can successfully sign in to my webmd account")
	public void i_can_successfully_sign_in_to_my_webmd_account() {
	   
	  driver.close();  
	}

	
}
