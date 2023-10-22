package com.juaracoding.pages;
import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.awt.image.Kernel;

public class ShopPage {
    private WebDriver driver;
    //    @FindBy(xpath = ("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a"))
//    private WebElement menuRecruitment;
    @FindBy(xpath = ("//*[@id=\"noo-site\"]/section/div/div/div/span[1]/a"))
    private WebElement menuSearch;

    @FindBy(xpath = ("//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div"))
    private WebElement pilihBaju;

    @FindBy(xpath = ("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/h1"))
    private WebElement txtbaju;
    //*[@id="product-704"]/div[1]/div[2]/h1

    @FindBy(xpath = ("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/button"))
    private WebElement addToCart;

    @FindBy(xpath = ("/html/body/div[2]/header/div[2]/div/div/div/ul/li/a/span/span[2]"))
    private WebElement openCart;

    @FindBy(xpath = ("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[2]/a"))
    private WebElement containOfcart;

    @FindBy(xpath = ("/html/body/p/a"))
    private WebElement dismis;

    @FindBy(xpath = ("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div/h3/a"))
    private WebElement secondDress;

    @FindBy(xpath = ("//*[@id=\"pa_color\"]"))
    private WebElement color;
    @FindBy(xpath = ("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[1]/td/select/option[3]"))
    private WebElement black;

    @FindBy(xpath = ("//*[@id=\"pa_size\"]"))
    private WebElement size;

    @FindBy(xpath = ("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[2]/td/select/option[2]"))
    private WebElement large;

    @FindBy(xpath = ("//*[@id=\"product-1162\"]/div[1]/div[2]/form/div/div[2]/button"))
    private WebElement secondSubmit;

    @FindBy(xpath = ("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div/button[2]/i"))
    private WebElement add;

    @FindBy(xpath = ("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div/button[1]/i"))
    private WebElement min;

    @FindBy(xpath = ("//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[2]/td/a[2]"))
    private WebElement continueshop;

    @FindBy(xpath = ("/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[2]/div/a"))
    private WebElement checkout;

    @FindBy(xpath = ("//*[@id=\"noo-site\"]/section/div/div/h1"))
    private WebElement txtcheckout;

    @FindBy(xpath = ("//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[2]/td[2]/a"))
    private WebElement txtsecondproduct;















    //Locator

    public ShopPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void search() {
//        menuRecruitment.click();
        menuSearch.click();

    }
    public void firstProduct(){
        pilihBaju.click();
    }
    public void secondProduct(){
        secondDress.click();
    }
    public void chooseColor(){
        color.click();
    }
    public void chooseblack(){
        black.click();
    }

    public void chooseSize(){
        size.click();
    }
    public void chooseLarge(){
        large.click();
    }
    public void setContinueshop(){
        continueshop.click();
    }
    public void setSecondSubmitu(){
        secondSubmit.click();
    }
    public void setAdd(){
        add.click();
    }
    public void setmin(){
        min.click();
    }
    public void ClickOpen(){
        openCart.click();
    }
    public void clickCheckout(){
        checkout.click();
    }



    public String getTxtBaju(){
        return txtbaju.getText();
    }
    public  String getTxtContain(){
        return containOfcart.getText();
    }
    public  String getTxtCheckout(){
        return txtcheckout.getText();
    }
    public  String getTxtsecond(){
        return txtsecondproduct.getText();
    }

    public void add(){
        dismis.click();
        addToCart.click();
        openCart.click();
    }
}
