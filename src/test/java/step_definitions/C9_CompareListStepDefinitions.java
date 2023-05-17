package step_definitions;

import Pages.P9_CompareListPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.BrowserUtils;


public class C9_CompareListStepDefinitions {

    P9_CompareListPageElements compare = Hooks.PageBase.p9_compareListPageElementsPOM();

    @Given("logged user can add First Product to Compare list")
    public void add_First_Product_to_Compare_list() {
        // Add & Assert product_1 to Compare list using POM //
        compare.compareProd1Ele();
        BrowserUtils.waitFor(3);
        System.out.println("First product has been added to your product comparison");
    }
    //------------------------------------------------------------------------------//

    @And("logged user can add Second Product to Compare list")
    public void add_Second_Product_to_Compare_list() {
        // Add & Assert product_2 to Compare list using POM //
        compare.compareProd2Ele();
        BrowserUtils.waitFor(3);
        System.out.println("Second product has been added to your product comparison");
    }
    //------------------------------------------------------------------------------//

    @And("logged user can add Third Product to Compare list")
    public void add_Third_Product_to_Compare_list() {
        // Add & Assert product_3 to Compare list using POM //
        compare.compareProd3Ele();
        BrowserUtils.waitFor(3);
        System.out.println("Third product has been added to your product comparison");
    }
    //------------------------------------------------------------------------------//

    @When("logged user navigates to Compare products list")
    public void navigate_to_Compare_products_list()
    {
        // Go to Compare products list using POM //
        compare.comparePageEle();
    }
    //------------------------------------------------------------------------------//

    @Then("logged user could compare between the selected products")
            public void compare_between_the_selected_products()
    {
        // Check Compare products table using POM //
        compare.compareCheckEle();
        System.out.println("You have three products in the compare table");
    }
    //------------------------------------------------------------------------------//

    @And("logged user can clear a product from list")
    public void clear_a_product_from_list()
    {
        // Clear a product from the compare list using POM //
        compare.compareProdClearEle();
        // Check remaining products in the compare table using POM //
        System.out.println("You have two products in the compare table");
    }
    //------------------------------------------------------------------------------//

    @And("logged user deletes all the list")
    public void Delete_all_the_list() {
        // Delete all products from the compare list & Check deleted list using POM //
        BrowserUtils.waitFor(2);
        String expectedResult = "You have no items to compare.";
        Assert.assertEquals(compare.compareDeleteListEle(), expectedResult, "ERROR: Assertion False!");
        System.out.println("You have no items to compare.");
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//