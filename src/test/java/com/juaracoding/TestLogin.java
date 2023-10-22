package com.juaracoding;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constans;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setup() {
        DriverSingleton.getInstance(Constans.CHROME);
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();
    }

    @AfterAll
    public static void finish() {
        DriverSingleton.delay(3);
        DriverSingleton.classObjectInstance();
    }

    @Given("User enter url HRM")
    public void user_enter_url_hrm() {
        driver.get(Constans.URL);
    }

    @When("User input valid username")
    public void user_input_valid_username() {
        loginPage.inputUsername("feryokta16");
    }

    @And("User input valid password")
    public void user_input_valid_Password() {
        loginPage.inputPassword("#Amala1908");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickbuttonLogin();
    }

    @Then("User menampilkan title page")
    public void user_get_title_Invalid_credentials() {
        Assert.assertEquals(loginPage.getTxtDashboard(), "Hello Feryokta16 (not Feryokta16? Log out)");
    }

    //TCC HRM 0.0.2
    @Given("User Logout")
    public void user_logout() {
        loginPage.logOut();
    }

    @When("User input invalid password")
    public void User_input_invalid_password() {
        loginPage.inputPassword("admin1234");
    }

    @Then("User get text invalid credential")
    public void user_get_text_invalid_credential() {
        Assert.assertEquals(loginPage.getTxtInvalid(), "ERROR");
    }

    @Given("clear username")
    public void clear_username(){
        loginPage.ClearUsername();
    }
    @And("User input Blank username")
    public void user_input_blank_usrname(){
        loginPage.inputUsername("");
    }
    @Then("User get text required")
    public void user_get_text_required(){
        Assert.assertEquals(loginPage.getrequiredUsername(),"Error: Username is required.");
    }
}
