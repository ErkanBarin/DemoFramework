package com.DS.pages;

import com.DS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trial_Products {
    public Trial_Products(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(linkText = "VIEW FACT SHEET")
    public WebElement factSheet;
}
