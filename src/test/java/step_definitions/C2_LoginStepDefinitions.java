package step_definitions;

import Pages.P2_LoginPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;


public class C2_LoginStepDefinitions {

    P2_LoginPageElements login = Hooks.PageBase.p2_loginPageElementsPOM();

    @Given("user navigates to login page")
    public void user_navigates_to_login_page() {
        // Navigate to Login Page using POM //
        login.loginPageEle();
        BrowserUtils.waitFor(1);
    }
    //------------------------------------------------------------------------------//

    @When("user can login with valid email and valid password")
    public void login_with_valid_email_and_valid_password()
    {
        // Login as a registered user using POM //
        login.loginDataEle(C1_RegistrationStepDefinitions.email, C1_RegistrationStepDefinitions.pass);
    }
    //------------------------------------------------------------------------------//

    @Then("user could login successfully")
    public void user_could_login_successfully() throws InterruptedException {
        BrowserUtils.waitFor(2);
        // Login Assertion using POM //
        login.loginAsserEle();
        System.out.println("Assertion: User has logged in Successfully");
    }
    //------------------------------------------------------------------------------//

    @And("logged user logs out")
    public void logged_user_logs_out()
    {
        // Logout from account using POM //
        login.loginLogoutEle();
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//

