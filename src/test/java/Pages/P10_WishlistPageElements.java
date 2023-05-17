package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P10_WishlistPageElements {

    public WebDriver driver;

    public P10_WishlistPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By wishListCateSelectPOM = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]/a");
    By wishListProd1AddPOM = By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/button[3]");
    By wishListProdAsserPOM = By.cssSelector("p[class=\"content\"]");
    By wishListProd2AddPOM = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[3]");
    By wishListProd2AsserPOM = By.cssSelector("p[class=\"content\"]");
    By wishListPagePOM = By.xpath("//div[@class=\"footer-upper\"]/div[3]/ul/li[5]/a");
    By wishListProdsCheckPOM = By.cssSelector("td[class=\"product\"]");
    //------------------------------------------------------------------------------//

    public void wishListCateSelectEle()
    {
        driver.findElement(wishListCateSelectPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void wishListProd1AddEle()
    {
        // Add product_1 to Wishlist //
        driver.findElement(wishListProd1AddPOM).click();
        // Assertion product_1 //
        Assert.assertTrue(driver.findElement(wishListProdAsserPOM).isDisplayed());
    }
    //------------------------------------------------------------------------------//

    public void wishListProd2AddEle()
    {
        // Add product_2 to Wishlist & Assert its existence using POM //
        driver.findElement(wishListProd2AddPOM).click();
        // Assertion product_2 //
        Assert.assertTrue(driver.findElement(wishListProd2AsserPOM).isDisplayed());
    }
    //------------------------------------------------------------------------------//

    public void wishListPageEle()
    {
        // Go to Wishlist page //
        driver.findElement(wishListPagePOM).click();

        // Check Wishlist products table //
        int count = driver.findElements(wishListProdsCheckPOM).size();  //2
        System.out.println(count);
        Assert.assertTrue(count > 0);

        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(wishListProdsCheckPOM).get(x).isDisplayed());
            Assert.assertTrue(driver.findElements(wishListProdsCheckPOM).get(x).isDisplayed());
        }
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//
