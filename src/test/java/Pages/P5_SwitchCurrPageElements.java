package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class P5_SwitchCurrPageElements {

    public WebDriver driver;

    public P5_SwitchCurrPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By switchSelProdPOM = By.cssSelector("a[href=\"/htc-one-mini-blue\"]");
    By switchCurrPOM = By.id("customerCurrency");
    By switchAsserPOM = By.id("price-value-19");
    //------------------------------------------------------------------------------//

    public void switchSelProdEle()
    {
        // Select a product //
        driver.findElement(switchSelProdPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void switchCurrEle()
    {
        // Create object of the Selected class //
        Select selCurr = new Select(driver.findElement(switchCurrPOM));
        //Select the option from value //
        selCurr.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fhtc-one-mini-blue");
    }
    //------------------------------------------------------------------------------//

    public void switchAsserEle()
    {
        // Switch Currency Assertion using POM //
        Assert.assertTrue(driver.findElement(switchAsserPOM).isDisplayed(),
                "Error Message: The currency has not been changed");
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//

