package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class P7_FilterColorPageElements {

    public WebDriver driver;

    public P7_FilterColorPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By colorSelCatePOM = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a");
    By colorSelSubCatePOM = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/ul/li[1]/a");
    By coloFilter1POM = By.id("attribute-option-15");
//    By colorFilter2POM = By.cssSelector("span[style=\"background-color:#8a374a\"]");
    By colorCheckPOM = By.cssSelector("div[class=\"picture\"]");
    //------------------------------------------------------------------------------//

    public void colorSelProdEle()
    {
        // Select Shoes sub-Category from Apparel Category //
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(colorSelCatePOM))
                .moveToElement(driver.findElement(colorSelSubCatePOM))
                .click().build().perform();
    }
    //------------------------------------------------------------------------------//

    public void colorFilterEle()
    {
        // Filter Shoes Product with Color //
        driver.findElement(coloFilter1POM).click();
//        driver.findElement(colorFilter2POM).click();
    }
    //------------------------------------------------------------------------------//

    public void colorCheckEle()
    {
        // Check Selected Color //
        Assert.assertTrue(driver.findElement(colorCheckPOM).isDisplayed(),
                "Error Message: Selected Color Not Found!");
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//
