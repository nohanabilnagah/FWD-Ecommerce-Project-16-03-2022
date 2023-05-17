package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P2_LoginPageElements {

    public WebDriver driver;

    public P2_LoginPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By loginLinkPOM = By.className("ico-login");
    By loginMailPOM = By.xpath("//div[@class=\"form-fields\"]/div[1]/input");
    By loginPassPOM = By.xpath("//div[@class=\"form-fields\"]/div[2]/input");
//    By loginBtnPOM = By.linkText("login-button");
    By loginAsserPOM = By.className("ico-account");
    By loginLogoutPOM = By.className("ico-logout");
    //------------------------------------------------------------------------------//

    public void loginPageEle()
    {
        // Navigate to Login Page //
        driver.findElement(loginLinkPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void loginDataEle(String email, String pass)
    {
        // Enter Valid Email //
        driver.findElement(loginMailPOM).click();
        driver.findElement(loginMailPOM).clear();
        driver.findElement(loginMailPOM).sendKeys(email);
        // Enter Valid Password //
        driver.findElement(loginPassPOM).click();
        driver.findElement(loginPassPOM).clear();
        driver.findElement(loginPassPOM).sendKeys(pass);
        // Press Login Button //
        driver.findElement(loginPassPOM).sendKeys(Keys.ENTER);
//        driver.findElement(loginBtnPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void loginAsserEle()
    {
        // Login Assertion //
        Assert.assertTrue(driver.findElement(loginAsserPOM).isDisplayed(), "Login Failed");
    }
    //------------------------------------------------------------------------------//

    public void loginLogoutEle()
    {
        // Logout from account //
        driver.findElement(loginLogoutPOM).click();
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//

