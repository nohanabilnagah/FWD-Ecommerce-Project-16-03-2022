package step_definitions;

import Pages.P11_ShoppCartPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class C11_ShoppingCartStepDefinitions {

    P11_ShoppCartPageElements shoppCart = Hooks.PageBase.p11_shoppCartPageElementsPOM();

    @Given("logged user checks all his Wishlist products")
    public void Check_Wishlist_products()
    {
        // Check products using POM //
        shoppCart.shoppCartProdsCheckEle();
    }
    //------------------------------------------------------------------------------//

    @Then("logged user could add his Wishlist products to Shopping Cart")
    public void add_Wishlist_products_to_Shopping_Cart()
    {
        // Add Wishlist products to CART using POM //
        shoppCart.shoppCartADDEle();
        System.out.println("Elements in SKU are present in Shopping Cart");

        // Option 2 to wait until products appear in Shopping Cart //
//        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//
