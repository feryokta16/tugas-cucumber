package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
    private WebDriver driver;
    @FindBy(xpath = ("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a"))
    private WebElement recruitment;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")
    private WebElement vacancies;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    private WebElement add;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")
    private WebElement vacancyName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement jobTitle;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]")
    private WebElement manager;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div/input")
    private WebElement hiringManager;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/form/div[7]/button[2]")
    private WebElement btnSave;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    private WebElement txtMessage;



    //Locator

    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    public void testrecruitment() {
       recruitment.click();
    }
    public void setVacancies(){
        vacancies.click();
    }
    public void clickAdd(){
        add.click();
    }
    public void clickVacancies(String nama){
        vacancyName.sendKeys(nama);
    }
    public void testJobVacancy(String coba){
        jobTitle.sendKeys(coba);
    }
//    public void AddManager(){
//        manager.click();
//    }
    public void addHiringManager(String hiring){
        hiringManager.sendKeys(hiring);
    }
    public void clickSave(){
        btnSave.click();
    }
    public String txtsuccessfull(){
        return txtMessage.getText();
    }







}

