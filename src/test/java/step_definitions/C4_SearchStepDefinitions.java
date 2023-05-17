package step_definitions;

import Pages.P4_SearchPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;

public class C4_SearchStepDefinitions {

    P4_SearchPageElements search = Hooks.PageBase.p4_searchPageElementsPOM();

    @When("logged user clicks on search field")
    public void logged_user_clicks_on_search_field()
    {
        // Locate search field and click on it using POM //
        search.searchFieldEle();
    }
    //------------------------------------------------------------------------------//

    @And("logged user searches with name of product")
    public void logged_user_searches_with_name_of_product()
    {
        // Search for a product using POM //
        search.searchProdEle("HTC");
        Hooks.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    //------------------------------------------------------------------------------//

    @Then("logged user could find relative results")
    public void logged_user_could_find_relative_results()
    {
        // Assertion Product Result using POM //
        search.searchAsserEle();
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//