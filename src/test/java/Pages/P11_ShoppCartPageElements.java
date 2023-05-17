package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P11_ShoppCartPageElements {

    public WebDriver driver;

    public P11_ShoppCartPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By shoppCartProd1CheckPOM = By.xpath("//table[@class=\"cart\"]/tbody/tr[1]/td[1]/input");
    By shoppCartProd2CheckPOM = By.xpath("//table[@class=\"cart\"]/tbody/tr[2]/td[1]/input");
    By shoppCartADDPOM = By.name("addtocartbutton");
    By shoppCartWaitPOM = By.cssSelector("td[class=\"sku\"]");
    //------------------------------------------------------------------------------//

    public void shoppCartProdsCheckEle()
    {
        // Check product_1 //
        driver.findElement(shoppCartProd1CheckPOM).click();
        // Check product_2 //
        driver.findElement(shoppCartProd2CheckPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void shoppCartADDEle()
    {
        // Add Wishlist products to CART //
        driver.findElement(shoppCartADDPOM).click();
        // Wait until products appear in Shopping Cart //
        Duration timeout = Duration.ofSeconds(15);
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(shoppCartWaitPOM));
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//

