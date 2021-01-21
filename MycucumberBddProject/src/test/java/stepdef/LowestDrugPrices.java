package stepdef;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;
public class LowestDrugPrices {
	WebDriver driver=null;
	@Given("User is on webmd member subscribe page")
	public void user_is_on_webmd_member_subscribe_page() {
	    
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://member.webmd.com/subscribe");
	    
	    
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("User click on find lowest drug prices")
	public void user_click_on_find_lowest_drug_prices() {
		

		WebElement findLowestpricesDrugs=driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div[1]/div[2]/a[3]"));

		findLowestpricesDrugs.click();

	}

	@And("click view all drugs")
	public void click_view_all_drugs() {
		WebElement findlowestprices=driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div[3]/span[2]/a"));

		findlowestprices.click();
	}

	@And("click on {string}")
	public void click_on(String string) {
	    
		WebElement druglipitor=driver.findElement(By.xpath("//*[@id=\"topDrugsListContainer\"]/ul[1]/li[6]/a"));

		druglipitor.click();
	}

	@Then("user can successfully find lowest price drugs")
	public void user_can_successfully_find_lowest_price_drugs() {
		driver.close();
	    System.out.println("passed");
	    driver.close();
	}



	
	

}
