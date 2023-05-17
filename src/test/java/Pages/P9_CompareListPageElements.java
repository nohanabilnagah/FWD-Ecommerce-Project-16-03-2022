package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P9_CompareListPageElements {

    public WebDriver driver;

    public P9_CompareListPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By compareProd1POM = By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/button[2]");
    By compareProd1AsserPOM = By.cssSelector("p[class=\"content\"]");
    By compareProd2POM = By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/button[2]");
    By compareProd2AsserPOM = By.cssSelector("p[class=\"content\"]");
    By compareProd3POM = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    By compareProd3AsserPOM = By.cssSelector("p[class=\"content\"]");
    By comparePagePOM = By.cssSelector("a[href=\"/compareproducts\"]");
    By compareCheckPOM = By.cssSelector("a[class=\"picture\"]");
    By compareProdClearPOM = By.xpath("//tr[@class=\"remove-product\"]/td[3]/button");
    By compareProdCountAsserPOM = By.cssSelector("a[class=\"picture\"]");
    By deleteListPOM = By.xpath("//div[@class=\"page-body\"]/a");
    By compareDeleteListAsserPOM = By.xpath("//div[@class=\"page-body\"]/div");
    //------------------------------------------------------------------------------//

    public void compareProd1Ele()
    {
        // Add product_1 to Compare list //
        driver.findElement(compareProd1POM).click();
        // Assertion product_1 //
        Assert.assertTrue(driver.findElement(compareProd1AsserPOM).isDisplayed());
    }
    //------------------------------------------------------------------------------//

    public void compareProd2Ele()
    {
        // Add product_2 to Compare list //
        driver.findElement(compareProd2POM).click();
        // Assertion product_2 //
        Assert.assertTrue(driver.findElement(compareProd2AsserPOM).isDisplayed());
    }
    //------------------------------------------------------------------------------//

    public void compareProd3Ele()
    {
        // Add & Assert product_3 to Compare list using POM //
        driver.findElement(compareProd3POM).click();
        // Assertion product_3 //
        Assert.assertTrue(driver.findElement(compareProd3AsserPOM).isDisplayed());
    }
    //------------------------------------------------------------------------------//

    public void comparePageEle()
    {
        // Go to Compare products list //
        driver.findElement(comparePagePOM).click();
    }
    //------------------------------------------------------------------------------//

    public void compareCheckEle()
    {
        // Check Compare products table //
        int count = driver.findElements(compareCheckPOM).size();  //3
        System.out.println(count);
        Assert.assertTrue(count > 0);

        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(compareCheckPOM).get(x).isDisplayed());
            Assert.assertTrue(driver.findElements(compareCheckPOM).get(x).isDisplayed());
        }
    }
    //------------------------------------------------------------------------------//

    public void compareProdClearEle()
    {
        // Clear a product from the compare list//
        driver.findElement(compareProdClearPOM).click();
        // Check remaining products //
        int count = driver.findElements(compareProdCountAsserPOM).size();  //2
        System.out.println(count);
        Assert.assertTrue(count > 0);

        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(compareProdCountAsserPOM).get(x).isDisplayed());
            Assert.assertTrue(driver.findElements(compareProdCountAsserPOM).get(x).isDisplayed());
        }
    }
    //------------------------------------------------------------------------------//

    public String compareDeleteListEle()
    {
        // Delete all products from the compare list //
        driver.findElement(deleteListPOM).click();
        // Check deleted list //
        String actualResult = driver.findElement(compareDeleteListAsserPOM).getText();
        return actualResult;
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//