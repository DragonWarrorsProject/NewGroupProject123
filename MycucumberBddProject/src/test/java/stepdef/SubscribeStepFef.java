package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;

public class SubscribeStepFef {
WebDriver driver=null;



@Given("I am in webmd homepage")
public void i_am_in_webmd_homepage() {
  System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver= new ChromeDriver();
    driver.get("http://www.webmd.com/");
    
    
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    
}

@When("I enter my email to webmd newsletter box")
public void i_enter_my_email_to_webmd_newsletter_box() {
	WebElement subscribe=driver.findElement(By.xpath("//*[@id=\"newsletterHover\"]/div[2]/form/div[2]/div[1]/input"));
	subscribe.sendKeys("TalenTech@gmail.com");
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    
}

@And("click on subscribe button")
public void click_on_subscribe_button() {
	WebElement subscribeclick=driver.findElement(By.xpath("//*[@id=\"newsletterHover\"]/div[2]/form/div[2]/div[1]/button/span"));
	subscribeclick.click();
    
}

@Then("I can succesfully subscribe webmd newsletter")
public void i_can_succesfully_subscribe_webmd_newsletter() {
	driver.close();
}


	
	
	

}
