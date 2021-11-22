package Steps;

//public class LoginDemoSteps1 {


//    WebDriver driver=null;
//    @Given("browser is open there")
//    public void browser_is_open_there() {
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//
//    }
//
//    @And("user is on login page site")
//    public void user_is_on_login_page_site() {
//        driver.navigate().to("https://example.testproject.io/web/");
//
//    }
// // Add  (.*) and (.*) whenver you use paramentization and ^ and $ as shown in when
//    @When("^user enters (.*) and (.*) details$")
//    public void user_enters_username_and_password_details(String username, String password)  {
//       driver.findElement(By.cssSelector("#name")).sendKeys(username);
//       driver.findElement(By.cssSelector("#password")).sendKeys(password);
//        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//
//    }
//    @And("user clicks on login")
//    public void userClicksOnLogin() throws InterruptedException {
//        driver.findElement(By.cssSelector("#login")).click();
//        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        Thread.sleep(2000);
//    }
//
//    @Then("user is navigated to the home page site")
//    public void user_is_navigated_to_the_home_page_site() throws InterruptedException {
//    driver.findElement(By.cssSelector("#logout")).isDisplayed();
//        Thread.sleep(2000);
//        driver.close();
//    }
//
//
//}
