package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class GoogleSearchSteps {


    WebDriver driver = null;
    @Given("browser is open")
    public void browser_is_open() {
   System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    }

    @And("user is on google page")
    public void user_is_on_google_page() {
   driver.navigate().to("https://www.google.com/");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() throws InterruptedException {
      driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Automation step by step");
      Thread.sleep(3000);
    }

    @And("clicks submit button")
    public void clicks_submit_button() throws InterruptedException {
     driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).click();
     Thread.sleep(3000);
     }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
   driver.getPageSource().contains("Online Courses");
      driver.close();
    }



}
