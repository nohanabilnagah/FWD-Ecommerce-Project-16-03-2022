package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P6_CategoriesPageElements {

    public WebDriver driver;

    public P6_CategoriesPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By categoryRandomPOM = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li/a");
    By categoryCountPOM = By.cssSelector("h2[class=\"title\"]");
//    By categorySubRandomPOM = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/ul/li/a");
    By categorySubCountPOM = By.cssSelector("h2[class=\"product-title\"] a");
    By categoryProdPOM = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a");
    By categorySubProdPOM = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/ul/li[2]/a");
    //------------------------------------------------------------------------------//

    public void categoryRandomEle ()
    {
        // Get all Category products whose Quantity >0 //
        List<WebElement> productElements = driver.findElements(categoryRandomPOM);
        // Get the length of product Elements //
        int maxProduct = productElements.size();
        //Get Random number //
        Random random = new Random();
        int randomProduct = random.nextInt(maxProduct);
        // Select Random Category List //
        productElements.get(randomProduct).click();

        // Random Category Assertion //
        List<WebElement> products = driver.findElements(categoryCountPOM);
        System.out.println("Count of Products on the page is:"+products.size() );

        int count = driver.findElements(categoryCountPOM).size();
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> prodList1 = new ArrayList<>();
        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(categoryCountPOM).get(x).getText());
            prodList1.add(driver.findElements(categoryCountPOM).get(x).getText());
        }
        System.out.println(prodList1);
    }
    //------------------------------------------------------------------------------//

    public void categorySubEle()
    {
        // Hover and open Random sub-Category from Category //
        //***Option_1
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(categoryProdPOM))
                .moveToElement(driver.findElement(categorySubProdPOM))
                .click().build().perform();

//        //***Option_2
//        Actions act1 = new Actions(driver);
//        WebElement webEle = driver.findElement(categoryProdPOM);
//        act1.moveToElement(webEle ).moveToElement(driver.findElement(categorySubProdPOM))
//                .click().build().perform();

        // Random sub-Category Assertion //
        List<WebElement> products = driver.findElements(categorySubCountPOM);
        System.out.println("Count of Products on the page is:"+products.size() );

        int count = driver.findElements(categorySubCountPOM).size();
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> prodList1 = new ArrayList<>();
        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(categorySubCountPOM).get(x).getText());
            prodList1.add(driver.findElements(categorySubCountPOM).get(x).getText());
        }
        System.out.println(prodList1);
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//