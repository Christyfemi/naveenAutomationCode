package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageModel {
    protected WebDriver driver;
    private By txt_username = By.cssSelector("#name");
    private By txt_password = By.cssSelector("#password");
    private By btn_login = By.cssSelector("#login");
    private By btn_logout = By.cssSelector("#logout");


    public LoginPageModel(WebDriver driver){
        this.driver=driver;


    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);

    }


    public void enterPASSWORD(String password){
        driver.findElement(txt_password).sendKeys(password);
    }


    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void clickLogout(){
        driver.findElement(btn_logout).isDisplayed();
    }
}
