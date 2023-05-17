package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class P12_OrderCheckPageElements {

    public WebDriver driver;

    public P12_OrderCheckPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------------------------------//
    By checkoutTermsPOM = By.xpath("//div[@class=\"terms-of-service\"]/input");
    By checkoutBtnPOM = By.xpath("//div[@class=\"checkout-buttons\"]/button");
    By checkoutWaitPOM = By.xpath("//div[@class=\"page-title\"]/h1");
    By checkoutFNamePOM = By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]");
    By checkoutLNamePOM = By.xpath("//input[@id=\"BillingNewAddress_LastName\"]");
    By checkoutMailPOM = By.xpath("//input[@id=\"BillingNewAddress_Email\"]");
    By checkoutCompNamePOM = By.xpath("//input[@id=\"BillingNewAddress_Company\"]");
    By checkoutCountryPOM = By.xpath("//select[@name=\"BillingNewAddress.CountryId\"]");
    By checkoutCityPOM = By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    By checkoutAddressPOM = By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");
    By checkoutPostCodePOM = By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]");
    By checkoutPhoneNoPOM = By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    By checkoutFaxNoPOM = By.xpath("//input[@id=\"BillingNewAddress_FaxNumber\"]");
    By checkoutBillAddSaveBtnPOM = By.xpath("//button[@onclick=\"Billing.save()\"]");
    By checkoutShipMethSelPOM = By.xpath("//ul[@class=\"method-list\"]/li[2]/div[1]/input");
    By checkoutShipMethSaveBtnPOM = By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    By checkoutPayMethSelPOM = By.cssSelector("input[id=\"paymentmethod_1\"]");
    By checkoutPayMethSaveBtnPOM = By.xpath("//button[@onclick=\"PaymentMethod.save()\"]");
    By checkoutCardTypePOM = By.className("dropdownlists");
    By checkoutCardHolderNamePOM =By.xpath("//input[@id=\"CardholderName\"]");
    By checkoutCardNoPOM = By.xpath("//input[@id=\"CardNumber\"]");
    By checkoutCardExpMonthPOM = By.xpath("//select[@id=\"ExpireMonth\"]");
    By checkoutCardExpYearPOM = By.xpath("//select[@id=\"ExpireYear\"]");
    By checkoutCardCodePOM = By.xpath("//input[@id=\"CardCode\"]");
    By checkoutPaymentSaveBtnPOM = By.xpath("//button[@onclick=\"PaymentInfo.save()\"]");
    By checkoutOrderConfirmBtnPOM = By.cssSelector("button[onclick=\"ConfirmOrder.save()\"]");
    By checkoutConfirmationPOM = By.cssSelector("div[class=\"page-title\"]");
    By checkoutOrderDetailsPOM = By.partialLinkText("details");
    By checkoutInvoiceSavePOM = By.xpath("//a[@class=\"button-2 pdf-invoice-button\"]");
    By checkoutInvoicePrintPOM = By.xpath("//a[@class=\"button-2 print-order-button\"]");
    //------------------------------------------------------------------------------//

    public void checkoutProceedEle()
    {
        // Agree with the terms of service //
        driver.findElement(checkoutTermsPOM).click();
        // Press Checkout button //
        driver.findElement(checkoutBtnPOM).click();

        // Wait for Checkout Page//
        // Option_1 to Wait
        Duration timeout = Duration.ofSeconds(15);
        WebDriverWait wait1 = new WebDriverWait(driver, timeout);
        wait1.until(ExpectedConditions.textToBePresentInElementLocated(checkoutWaitPOM, "Checkout"));

//        //Option_2 to Wait
//        WebElement element = driver.findElement(checkoutWaitPOM);
//        WebDriverWait wait2 = new WebDriverWait(driver, 15);
//        wait2.until(ExpectedConditions.textToBePresentInElement(element, "Checkout"));
    }
    //------------------------------------------------------------------------------//

    public void checkoutFillDataEle(String FirstName, String LastName, String email, String CompName, String city,
                                    String address1, String postCode, String phoneNo, String faxNo)
    {
        // Enter First Name //
        driver.findElement(checkoutFNamePOM).click();
        driver.findElement(checkoutFNamePOM).clear();
        driver.findElement(checkoutFNamePOM).sendKeys(FirstName);
        // Enter Last Name //
        driver.findElement(checkoutLNamePOM).click();
        driver.findElement(checkoutLNamePOM).clear();
        driver.findElement(checkoutLNamePOM).sendKeys(LastName);
        // Write valid Email //
        driver.findElement(checkoutMailPOM).click();
        driver.findElement(checkoutMailPOM).clear();
        driver.findElement(checkoutMailPOM).sendKeys(email);
        // Write Company Name //
        driver.findElement(checkoutCompNamePOM).click();
        driver.findElement(checkoutCompNamePOM).clear();
        driver.findElement(checkoutCompNamePOM).sendKeys(CompName);
        // Select Country from VisibleText //
        Select country = new Select(driver.findElement(checkoutCountryPOM));
        country.selectByVisibleText("Egypt"); //Select Country Name using visible text
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Enter City //
        driver.findElement(checkoutCityPOM).click();
        driver.findElement(checkoutCityPOM).clear();
        driver.findElement(checkoutCityPOM).sendKeys(city);
        // Write Address_1 //
        driver.findElement(checkoutAddressPOM).click();
        driver.findElement(checkoutAddressPOM).clear();
        driver.findElement(checkoutAddressPOM).sendKeys(address1);
        // Enter Postal Code //
        driver.findElement(checkoutPostCodePOM).click();
        driver.findElement(checkoutPostCodePOM).clear();
        driver.findElement(checkoutPostCodePOM).sendKeys(postCode);
        // Write Phone Number //
        driver.findElement(checkoutPhoneNoPOM).click();
        driver.findElement(checkoutPhoneNoPOM).clear();
        driver.findElement(checkoutPhoneNoPOM).sendKeys(phoneNo);
        // Write Fax Number //
        driver.findElement(checkoutFaxNoPOM).click();
        driver.findElement(checkoutFaxNoPOM).clear();
        driver.findElement(checkoutFaxNoPOM).sendKeys(faxNo);
    }
    //------------------------------------------------------------------------------//

    public void checkoutBillAddSaveEle()
    {
        // Press Continue to Save Billing Address //
        driver.findElement(checkoutBillAddSaveBtnPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void checkoutShipMethEle()
    {
        // Select Shipping Method (Next Day Air ($0.00)) //
        driver.findElement(checkoutShipMethSelPOM).click();
        // Press CONTINUE //
        driver.findElement(checkoutShipMethSaveBtnPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void checkoutPayMethEle()
    {
        // Select Payment Method (Pay by Credit Card)) //
        driver.findElement(checkoutPayMethSelPOM).click();
        // Press CONTINUE //
        driver.findElement(checkoutPayMethSaveBtnPOM).click();
    }
    //------------------------------------------------------------------------------//

    public void checkoutPayDataEle(String cardHolderName, String cardNumber, String cardCode)
    {
        // Select Credit Card Type //
        Select card = new Select(driver.findElement(checkoutCardTypePOM));
        card.selectByValue("MasterCard"); //Select Credit Card Type from Value
        // Write Cardholder Name //
        driver.findElement(checkoutCardHolderNamePOM).click();
        driver.findElement(checkoutCardHolderNamePOM).clear();
        driver.findElement(checkoutCardHolderNamePOM).sendKeys(cardHolderName);
        // Enter Card Number //
        driver.findElement(checkoutCardNoPOM).click();
        driver.findElement(checkoutCardNoPOM).clear();
        driver.findElement(checkoutCardNoPOM).sendKeys(cardNumber);
        //*** Enter Card Expiration Date ***//
        // Select Card Expiration Month //
        Select month = new Select(driver.findElement(checkoutCardExpMonthPOM));
        month.selectByValue("8"); //Select Card Expiration Month from Value
        // Select Card Expiration Year //
        Select year = new Select(driver.findElement(checkoutCardExpYearPOM));
        year.selectByValue("2023"); //Select Card Expiration Year from Value
        // Write Card Code //
        driver.findElement(checkoutCardCodePOM).click();
        driver.findElement(checkoutCardCodePOM).clear();
        driver.findElement(checkoutCardCodePOM).sendKeys(cardCode);
        // Press CONTINUE //
        driver.findElement(checkoutPaymentSaveBtnPOM).click();
        // Assertion //
        Duration timeout = Duration.ofSeconds(15);
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(checkoutOrderConfirmBtnPOM, "CONFIRM"));
    }
    //------------------------------------------------------------------------------//

    public void checkoutConfirmOrderEle()
    {
        // Confirm Order //
        driver.findElement(checkoutOrderConfirmBtnPOM).click();
        // Assertion //
        Duration timeout = Duration.ofSeconds(20);
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(checkoutConfirmationPOM, "Thank you"));
    }
    //------------------------------------------------------------------------------//

    public void checkoutInvoiceEle()
    {
        // Click for order details //
        driver.findElement(checkoutOrderDetailsPOM).click();
        System.out.println("Title of page is: " + driver.getTitle());
    }
    //------------------------------------------------------------------------------//

    public void checkoutInvoiceSaveEle()
    {
        // Save PDF Invoice //
        driver.findElement(checkoutInvoiceSavePOM).click();
    }
    //------------------------------------------------------------------------------//

    public void checkoutInvoicePrintEle()
    {
        // Print Invoice //
        driver.findElement(checkoutInvoicePrintPOM).click();
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//