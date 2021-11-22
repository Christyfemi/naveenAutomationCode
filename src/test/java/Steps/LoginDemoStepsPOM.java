package Steps;

import Page_Object_Model.LoginPageModel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoStepsPOM {


    WebDriver driver=null;
    LoginPageModel login;


    @Before
    public void browserSetup(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
         @After
       public void teardown(){
        driver.close();
        driver.quit();
       }

    @Given("browser is open there")
    public void browser_is_open_there() {
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();


    }

    @And("user is on login page site")
    public void user_is_on_login_page_site() {


        driver.navigate().to("https://example.testproject.io/web/");

    }
 // Add  (.*) and (.*) whenver you use paramentization and ^ and $ as shown in when
    @When("^user enters (.*) and (.*) details$")
    public void user_enters_username_and_password_details(String username, String password)  {

        login = new LoginPageModel(driver);
        login.enterUsername(username);
        login.enterPASSWORD(password);

//       driver.findElement(By.cssSelector("#name")).sendKeys(username);
//       driver.findElement(By.cssSelector("#password")).sendKeys(password);
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }
    @And("user clicks on login")
    public void userClicksOnLogin() throws InterruptedException {

        login.clickLogin();
//        driver.findElement(By.cssSelector("#login")).click();
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @Then("user is navigated to the home page site")
    public void user_is_navigated_to_the_home_page_site() throws InterruptedException {
        login.clickLogout();
//    driver.findElement(By.cssSelector("#logout")).isDisplayed();
        Thread.sleep(2000);
        //driver.close();
    }


}
