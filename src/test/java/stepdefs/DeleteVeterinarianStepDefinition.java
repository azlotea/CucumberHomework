package stepdefs;

import com.endava.AddNewVeterinarianPage;
import com.endava.NavigationPage;
import com.endava.TestBase;
import com.endava.VeterinariansPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DeleteVeterinarianStepDefinition extends TestBase {
    public NavigationPage navigationPage;
    public AddNewVeterinarianPage addNewVeterinarianPage;
    public VeterinariansPage veterinariansPage;

    @Given("^I add a new veterinarian$")
    public void i_add_a_new_veterinarian() throws Throwable {
        init();
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickAddNewVeterinarians(webDriver);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addNewVeterinarianPage = new AddNewVeterinarianPage(webDriver);
        addNewVeterinarianPage.addVeterinarians("Adrian", "Zlotea");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @When("^I am looking for him in the list and I click on delete button$")
    public void i_am_looking_for_him_in_the_list_and_I_click_on_delete_button() throws Throwable {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickAllVeterinarians(webDriver);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        veterinariansPage = new VeterinariansPage(webDriver);
        veterinariansPage.deleteNewVet("Adrian Zlotea");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^The veterinarian can't be found anymore on the list$")
    public void the_veterinarian_can_t_be_found_anymore_on_the_list() throws Throwable {
        veterinariansPage = new VeterinariansPage(webDriver);
        boolean checkveterinarian = veterinariansPage.isVeterinarianPresent("Adrian Zlotea");

        Assert.assertFalse(checkveterinarian);
        tearDown();
    }

}
