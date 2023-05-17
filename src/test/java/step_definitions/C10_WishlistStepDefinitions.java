package step_definitions;

import Pages.P10_WishlistPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;

public class C10_WishlistStepDefinitions {

    P10_WishlistPageElements wishList = Hooks.PageBase.p10_wishlistPageElementsPOM();

    @Given("logged user selects his favorite product")
    public void select_favorite_product()
    {
        // Select Jewelry from Category using POM //
        wishList.wishListCateSelectEle();
    }
    //------------------------------------------------------------------------------//

    @When("logged user adds a product to the Wishlist")
    public void add_a_product_to_the_Wishlist() {
        // Add product_1 to Wishlist & Assert its existence using POM //
        wishList.wishListProd1AddEle();
        BrowserUtils.waitFor(3);
        System.out.println("First product has been added to your wishlist");
    }
    //------------------------------------------------------------------------------//

    @And("logged user adds another product to the Wishlist")
    public void add_another_product_to_the_Wishlist() {
        // Add product_2 to Wishlist & Assert its existence using POM //
        wishList.wishListProd2AddEle();
        BrowserUtils.waitFor(3);
        System.out.println("Second product has been added to your wishlist");
    }
    //------------------------------------------------------------------------------//

    @Then("logged user navigates to his Wishlist page")
    public void navigates_to_Wishlist_page()
    {
        // Go to Wishlist page & Check Wishlist products table using POM //
        wishList.wishListPageEle();
        System.out.println("You have two products in your Wishlist table");
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//