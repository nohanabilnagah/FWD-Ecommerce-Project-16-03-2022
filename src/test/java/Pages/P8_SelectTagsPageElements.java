package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.ArrayList;

public class P8_SelectTagsPageElements {

    public WebDriver driver;

    public P8_SelectTagsPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By tagCoolSelectPOM = By.cssSelector("a[href=\"/cool\"]");
    By tagCoolPagePOM = By.xpath("//div[@class=\"page-title\"]/h1");
    By tagCoolCountPOM = By.cssSelector("h2[class=\"product-title\"] a");
    By tagCoolAsserPOM = By.cssSelector("div[class=\"buttons\"]");
    By tagShirtSelectPOM = By.cssSelector("a[href=\"/shirt\"]");
    By tagShirtPagePOM = By.xpath("//div[@class=\"page-title\"]/h1");
    By tagShirtCountPOM = By.cssSelector("h2[class=\"product-title\"] a");
    By tagShirtAsserPOM = By.cssSelector("h2[class=\"product-title\"] a");
    //------------------------------------------------------------------------------//

    public String tag1SelectEle()
    {
        // Select Cool Tag //
        driver.findElement(tagCoolSelectPOM).click();
        // Assert Cool Tag Products //
        String actualResult = driver.findElement(tagCoolPagePOM).getText();
        return actualResult;
    }
    //------------------------------------------------------------------------------//

    public void tag1CountEle()
    {
        // Check products into Cool tag //
        int count = driver.findElements(tagCoolCountPOM).size();  //6
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> prodList1 = new ArrayList<>();

        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(tagCoolCountPOM).get(x).getText());
            prodList1.add(driver.findElements(tagCoolCountPOM).get(x).getText());
            Assert.assertTrue(driver.findElements(tagCoolAsserPOM).get(x).getText().toUpperCase().contains("ADD TO CART"),
                    "Error Message: Cool Products Not Found");
        }
        System.out.println(prodList1);
    }
    //------------------------------------------------------------------------------//

    public String tag2SelectEle()
    {
        // Select Shirt Tag //
        driver.findElement(tagShirtSelectPOM).click();
        // Assert Shirt Tag Products //
        String actualResult = driver.findElement(tagShirtPagePOM).getText();
        return actualResult;
    }
    //------------------------------------------------------------------------------//

    public void tag2CountEle()
    {
        // Check products into shirt tag using POM //
        int count = driver.findElements(tagShirtCountPOM).size();  //3
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> prodList2 = new ArrayList<>();

        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(tagShirtCountPOM).get(x).getText());
            prodList2.add(driver.findElements(tagShirtCountPOM).get(x).getText());
            Assert.assertTrue(driver.findElements(tagShirtAsserPOM).get(x).getText().contains("Shirt"),
                    "Error Message: Shirt Products Not Found");
        }
        System.out.println(prodList2);
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//