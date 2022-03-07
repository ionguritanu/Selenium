package com.test.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
     //constructor
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "menu_admin_viewAdminModule")
    WebElement adminButton;

    @FindBy(xpath = "//b[.='PIM']")
    WebElement pimButton;


    public void clickAdminButton(){
        adminButton.click();
    }


    public void clickPimButton(){
        pimButton.click();
    }
}