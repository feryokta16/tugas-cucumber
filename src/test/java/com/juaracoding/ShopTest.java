package com.juaracoding;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ShopPage;
import com.juaracoding.utils.Constans;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShopTest {
    private static WebDriver driver;
    private static LoginPage loginPage;
    private  static ShopPage shop = new ShopPage();

    @BeforeAll
    public static void setup() {
        DriverSingleton.getInstance(Constans.CHROME);
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();
        shop = new ShopPage();
    }

    @AfterAll
    public static void finish() {
        DriverSingleton.delay(3);
        DriverSingleton.classObjectInstance();
    }

    @When("clear password")
    public void clear_password(){
        loginPage.ClearPassword();
    }
    @And("User login")
    public void user_login(){
        loginPage.login();
    }
    @And("User Search the product")
    public void user_search_the_product(){
        shop.search();
    }
    @And("user choose the first product")
    public void user_chose_first_product(){
        shop.firstProduct();
    }
    @And("user Add product")
    public void user_add_product(){
        shop.add();
    }
    @And("User get Message Tokyo Talkies")
    public void user_get_txt_message_tokyo_talkies(){
        Assert.assertEquals(shop.getTxtContain(),"TOKYO TALKIES");
    }


    @Given("User continue shoping")
    public void user_continue_shoping(){
        shop.setContinueshop();
    }
    @And("user choose the second product")
    public void user_choose_second_product(){
        shop.secondProduct();
    }
    @And("user choose the color")
    public void user_choose_the_color(){
        shop.chooseColor();
    }
    @And("user choose the black color")
    public void user_choose_the_red_color(){
        shop.chooseblack();
    }

    @And("user choose the size")
    public void user_choose_the_size(){
        shop.chooseSize();
    }
    @And("user choose the large size")
    public void user_choose_the_large_size(){
        shop.chooseLarge();
    }
    @And("user add contains of dress")
    public void user_add_contain_of_dress(){
        shop.setAdd();
    }
    @And("user min contains of dress")
    public void user_min_contain_of_dress(){
        shop.setmin();
    }

    @And("user click submit")
    public void user_click_submit(){
        shop.setSecondSubmitu();
    }
    @Then("user get text second product")
    public void user_get_text_second_product(){
        Assert.assertEquals(shop.getTxtsecond(),"BLACK CROSS BACK MAXI DRESS - BLACK");
    }

    @And("User click keranjang")
    public void user_click_keranjang(){
        shop.ClickOpen();
    }
    @And("user click checkout")
    public void user_click_checkout(){
        shop.clickCheckout();
    }
    @Then("user get checkout text")
    public void user_get_checkout_text(){
        Assert.assertEquals(shop.getTxtCheckout(),"CHECKOUT");
    }



}
