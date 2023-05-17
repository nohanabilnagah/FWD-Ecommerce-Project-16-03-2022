package step_definitions;

import Pages.P1_RegistrationPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.Random;

public class C1_RegistrationStepDefinitions {

    P1_RegistrationPageElements register = Hooks.PageBase.p1_registrationPageElementsPOM();

    @Given("new user launch registration page")
    public void new_user_launch_registration_page()
    {
        // Register as new user using POM //
        register.registerPageEle();
    }
    //------------------------------------------------------------------------------//

        // Write Valid Email with Random Generator //
        static Random randomGenerator = new Random();
        static int randomInt = randomGenerator.nextInt(1000);
        static String s = Integer.toString(randomInt);
        public static String email = "noha.nabil83"+ s +"@gmail.com";
        public static String pass = "123456";
        public static String FirstName = "Noha";
        public static String LastName = "Nabil";
        public static String CompName = "Embassy";
    //------------------------------------------------------------------------------//

    @And("new user fills registration form with valid data")
    public void new_user_fills_registration_form_with_valid_data() {
        // Fill valid Data using POM //
        register.registerDataEle(FirstName, LastName, email, pass, CompName);
    }
    //------------------------------------------------------------------------------//

    @When("new user can register")
    public void new_user_can_register()
        {
        // Press Register Button using POM //
        register.registerButtonEle();
        }
        //------------------------------------------------------------------------------//

    @Then("a success message is displayed")
    public void a_success_message_is_displayed()
    {
        // Registration Assertion_1 using POM //
        register.registerAsserEle();
        System.out.println("Assertion: Your registration completed");

        // Registration Assertion_2 using POM//
        String expectedResult = "Your registration completed";
//        Assert.assertEquals(register.registerAsserEle(), expectedResult, "Registration Failed");
        Assert.assertTrue(register.registerAsserEle().contains(expectedResult), "Error Message: User couldn't register successfully");
        System.out.println("Congratulations! Your registration completed");
    }
    //------------------------------------------------------------------------------//

    @And("user logs out after registering")
    public void log_out_after_registering()
    {
        // Logout from account using POM //
        register.registerLogoutEle();
    }
    //------------------------------------------------------------------------------//

}
//------------------------------------------------------------------------------------------------------------//

