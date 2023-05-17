package step_definitions;

import Pages.P8_SelectTagsPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class C8_SelectTagsStepDefinitions {

    P8_SelectTagsPageElements tagsSelect = Hooks.PageBase.p8_selectTagsPageElementsPOM();

    @Given("logged user can select a popular tag")
    public void select_a_popular_tag()
    {
        // Select Cool Tag using POM //
        tagsSelect.tag1SelectEle();
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        // Assert Cool Tag Products using POM //
        String expectedResult = "Products tagged with 'cool'";
        Assert.assertEquals(tagsSelect.tag1SelectEle(), expectedResult, "Assertion False: ");
//        Assert.assertTrue(tagsSelect.selectTag().contains(expectedResult), "Error Message: There are No Products");
        System.out.println("Products tagged with 'cool'");
    }
    //------------------------------------------------------------------------------//

    @When("logged user finds products")
    public void find_products()
    {
        // Check products into Cool tag using POM //
        tagsSelect.tag1CountEle();
    }
    //------------------------------------------------------------------------------//

    @Then("logged user could select a different tag")
    public void select_a_different_tag()
    {
        // Select Shirt Tag using POM //
        tagsSelect.tag2SelectEle();
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        // Assert Shirt Tag Products using POM //
        String expectedResult = "Products tagged with 'shirt'";
//        Assert.assertEquals(tagsSelect.tag2SelectEle(), expectedResult, "Assertion False: ");
        Assert.assertTrue(tagsSelect.tag2SelectEle().contains(expectedResult), "Error Message: There are No Products");
        System.out.println("Products tagged with 'shirt'");
    }
    //------------------------------------------------------------------------------//

    @And("logged user finds another different products")
    public void find_another_different_products()
    {
        // Check products into shirt tag using POM //
        tagsSelect.tag2CountEle();
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//
