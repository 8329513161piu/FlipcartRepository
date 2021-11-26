package commarce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	ChromeDriver driver;
	Actions action;
	@Given("user open {string} browser with exe {string}")
	public void user_open_browser_with_exe(String key, String exe) 
	{
		System.setProperty(key,exe);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    }

	@Given("user enter url as {string}")
	public void user_enter_url_as(String url)
	{
	    driver.get(url);
	}

	@Given("click on Cancle Button")
	public void click_on_cancle_button()
	{
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	}

	@Given("user Navigate to Login")
	public void user_navigate_to_login() throws Throwable
	{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement login= driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(login).build().perform();
	}

	@Given("click on MyProfile")
	public void click_on_my_profile() throws Throwable 
	{
		driver.findElementByXPath("//*[text()='My Profile']").click();
		Thread.sleep(6000);
	}

	@Given("user enter {string} as username")
	public void user_enter_as_username(String string) throws Exception
	{
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("8329513161");
		Thread.sleep(3000);
	}

	@Given("user enter {string} as password")
	public void user_enter_as_password(String string) throws Exception 
	{
		driver.findElementByXPath("//*[@type='password']").sendKeys("abc@123");
		Thread.sleep(3000);   
	}

	@Given("Click on Login")
	public void click_on_login() throws Exception 
	{
		driver.findElementByXPath("(//*[text()='Login']) [3]").click();
		Thread.sleep(5000);
	}

	@When("click on Manage Address")
	public void click_on_manage_address() throws Exception
	{
		driver.findElementByXPath("//*[@class='NS64GK'][1]").click();
		Thread.sleep(6000);
	}

	@When("user click on add a new address")
	public void user_click_on_add_a_new_address() throws InterruptedException
	{
		driver.findElementByXPath("//*[@class='_1QhEVk']").click();
		Thread.sleep(6000);
	}

	@Then("enter user {string} as a name")
	public void enter_user_as_a_name(String string) 
	{
		driver.findElementByXPath("//*[@class='_1w3ZZo _2mFmU7'][1]").sendKeys("Girija");
	}

	@Then("enter user {string} as a mobile no")
	public void enter_user_as_a_mobile_no(String string) throws Exception 
	{
		driver.findElementByXPath("//*[@name='phone']").sendKeys("8329513161");
		Thread.sleep(2000);
	}

	@Then("enter user {string} as a pincode")
	public void enter_user_as_a_pincode(String string)
	{
		driver.findElementByXPath("//*[@autocomplete='postal-code']").sendKeys("411001");
	}

	@Then("enter user {string} as a Locality")
	public void enter_user_as_a_locality(String string) 
	{
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Delhigate");  
	}

	@Then("enter user {string} as a Address")
	public void enter_user_as_a_address(String string) 
	{
		driver.findElementByXPath("//*[@class='_1sQQBU _1w3ZZo _1TO48q']").sendKeys("Ahmednagar");
	}

	@When("user select work as address type")
	public void user_select_work_as_address_type()
	{
		driver.findElementByXPath("//*[@class='_1XFPmK'][1]").click();
	}

	@Then("Click on Save Button")
	public void click_on_save_button() 
	{
		driver.findElementByXPath("//*[@tabindex='10']").click(); 
		
		
	}
}
