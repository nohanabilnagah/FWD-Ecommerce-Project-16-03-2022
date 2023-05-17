package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class P1_RegistrationPageElements {

    public WebDriver driver;

    public P1_RegistrationPageElements(WebDriver driver)
    {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By registerLinkPOM = By.linkText("Register");
    By registerGenderPOM = By.id("gender-female");
    By registerFNamePOM = By.id("FirstName");
    By registerLNamePOM = By.id("LastName");
    By registerDatePOM = By.name("DateOfBirthDay");
    By registerMonthPOM = By.name("DateOfBirthMonth");
    By registerYearPOM = By.name("DateOfBirthYear");
    By registerMailPOM = By.id("Email");
    By registerCompPOM = By.xpath("//input[@name=\"Company\"]");
    By registerUnNewsPOM = By.xpath("//label[@for=\"Newsletter\"]");
    By registerPassPOM  = By.id("Password");
    By registerConfPassPOM = By.id("ConfirmPassword");
    By registerBtnPOM = By.id("register-button");
    By registerAsser1POM = By.className("ico-account");
    By registerAsser2POM = By.cssSelector("div[class=\"result\"]");
    By registerLogoutPOM = By.className("ico-logout");
    //------------------------------------------------------------------------------//

    public void registerPageEle()
    {
        // Register as new user //
        driver.findElement(registerLinkPOM).click();
    }
    //------------------------------------------------------------------------------//

   public void registerDataEle(String FirstName, String LastName, String email, String pass, String CompName)
   {
       // Select Gender //
       driver.findElement(registerGenderPOM).click();

       // Enter First Name //
       driver.findElement(registerFNamePOM).click();
       driver.findElement(registerFNamePOM).clear();
       driver.findElement(registerFNamePOM).sendKeys(FirstName);
       // Enter Last Name //
       driver.findElement(registerLNamePOM).click();
       driver.findElement(registerLNamePOM).clear();
       driver.findElement(registerLNamePOM).sendKeys(LastName);

       // Enter Date of Birthday //
       // Select Day from Value
        Select day = new Select(driver.findElement(registerDatePOM)); //Create object of the Select class
        day.selectByValue("12"); //Select the option from Value
       // Select Month from VisibleText
        Select month = new Select(driver.findElement(registerMonthPOM));
        month.selectByVisibleText("March"); //Select the option using visible text
       // Select Year from Value
        Select year = new Select(driver.findElement(registerYearPOM));
        year.selectByValue("1983"); //Select the option from Value

        // Write valid Email //
        driver.findElement(registerMailPOM).click();
        driver.findElement(registerMailPOM).clear();
        driver.findElement(registerMailPOM).sendKeys(email);
        System.out.println(email);

        // Write Company Name //
        driver.findElement(registerCompPOM).click();
        driver.findElement(registerCompPOM).clear();
        driver.findElement(registerCompPOM).sendKeys(CompName);

        // Uncheck Newsletter
        driver.findElement(registerUnNewsPOM).click();

        // Write Password //
        driver.findElement(registerPassPOM).click();
        driver.findElement(registerPassPOM).clear();
        driver.findElement(registerPassPOM).sendKeys(pass);
       // Confirm Password //
        driver.findElement(registerConfPassPOM).click();
        driver.findElement(registerConfPassPOM).clear();
        driver.findElement(registerConfPassPOM).sendKeys(pass);
//        driver.findElement(registerConfPassPOM).sendKeys(Keys.ENTER);
   }
    //------------------------------------------------------------------------------//

    public void registerButtonEle()
    {
        // Press Register Button //
        driver.findElement(registerBtnPOM).click();
    }
    //------------------------------------------------------------------------------//

    public String registerAsserEle()
    {
        // Registration Assertion_1 //
        Assert.assertTrue(driver.findElement(registerAsser1POM).isDisplayed(), "Assertion False: User couldn't register");

        // Registration Assertion_2 //
        String actualResult = driver.findElement(registerAsser2POM).getText();
        return actualResult;
    }

    public void registerLogoutEle()
    {
        // Logout after registering //
        driver.findElement(registerLogoutPOM).click();
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//
