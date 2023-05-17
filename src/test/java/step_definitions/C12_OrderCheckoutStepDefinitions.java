package step_definitions;

import Pages.P12_OrderCheckPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;


public class C12_OrderCheckoutStepDefinitions {

    P12_OrderCheckPageElements checkout = Hooks.PageBase.p12_orderCheckPageElementsPOM();

    @Given("logged user agrees with terms and proceed to Checkout")
    public void proceed_to_Checkout() 
    {
       // Agree with terms, Press Checkout button & Wait for Checkout Page using POM //
       checkout.checkoutProceedEle();
       System.out.println("Welcome in Checkout Page!");
    }
    //------------------------------------------------------------------------------//

    // City, Address1, Postal Code, Phone Number, Fax Number, Credit Card Holder Name, Credit Card Number, Credit Card Code //
    public static String city = "Cairo";
    public static String address1 = "Maadi";
    public static String postCode = "55555";
    public static String phoneNo = "01005555555";
    public static String faxNo = "59595959";
    public static String cardHolderName = "NOHA NABIL";
    public static String cardNumber = "9999999999";
    public static String cardCode = "108";
    //------------------------------------------------------------------------------//

    @When("logged user fills out Billing address to Create Order")
    public void fill_out_Billing_address_to_Create_Order()
    {
        // Fill Billing Address Data using POM //
        checkout.checkoutFillDataEle(C1_RegistrationStepDefinitions.FirstName, C1_RegistrationStepDefinitions.LastName,
                C1_RegistrationStepDefinitions.email,C1_RegistrationStepDefinitions.CompName, city, address1,
                postCode, phoneNo, faxNo);
    }
    //------------------------------------------------------------------------------//

    @And("logged user confirms Billing address")
    public void confirms_Billing_address() {
        // Save Billing Address using POM //
        checkout.checkoutBillAddSaveEle();
        BrowserUtils.waitFor(2);
    }
    //------------------------------------------------------------------------------//

    @And("logged user selects Shipping Method to Continue")
    public void select_Shipping_Method_and_Continue() {
        // Select Shipping Method and Continue using POM //
        checkout.checkoutShipMethEle();
        BrowserUtils.waitFor(2);
    }
    //------------------------------------------------------------------------------//

    @And("logged user selects Payment Method to Continue")
    public void select_Payment_Method_and_Continue() {
        // Select Payment Method (Credit Card) and Continue using POM //
        checkout.checkoutPayMethEle();
        BrowserUtils.waitFor(2);
    }
    //------------------------------------------------------------------------------//

    @When("logged user fills out Payment Information")
    public void Fill_out_Payment_Information()
    {
        // Fill out Payment Information and Continue using POM //
        checkout.checkoutPayDataEle(cardHolderName, cardNumber, cardCode);
        System.out.println("Create Successful Order!");
    }
    //------------------------------------------------------------------------------//

    @Then("logged user could confirm his order")
    public void Confirm_Order()
    {
        // Confirm Order using POM //
        checkout.checkoutConfirmOrderEle();
        System.out.println("Your order has been successfully processed!");
    }
    //------------------------------------------------------------------------------//

    @And("logged user can check order details")
    public void check_order_details()
    {
        // Click for order details using POM //
        checkout.checkoutInvoiceEle();
    }
    //------------------------------------------------------------------------------//

    @And("logged user could save invoice")
    public void Save_Invoice() {
        // Save PDF Invoice using POM //
        checkout.checkoutInvoiceSaveEle();
        BrowserUtils.waitFor(3);
        System.out.println("PDF Invoice has been downloaded Successfully");
    }
    //------------------------------------------------------------------------------//

    @And("logged user could print invoice")
    public void Print_Invoice() {
        // Print Invoice using POM //
        checkout.checkoutInvoicePrintEle();
        BrowserUtils.waitFor(3);
        System.out.println("Invoice has been printed Successfully");
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//