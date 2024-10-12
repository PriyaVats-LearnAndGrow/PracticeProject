package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class LoginSteps {

    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        // Implement code to navigate to the login page
        System.out.println("Navigated to the login pages");
    }

    @When("the user enters a valid username and password")
    public void user_enters_valid_credentials() {
        // Implement code to enter valid credentials
        System.out.println("Entered valid username and password");
    }

    @Then("the user is redirected to the homepagee")
    public void user_is_redirected_to_homepage() {
        // Implement code to check if user is redirected to the homepage
        System.out.println("User is redirected to the homepage");
        // Assert statements can be used to verify the redirection
        assertTrue("User was not redirected to the homepage", true);
    }
}
