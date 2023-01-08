package com.DS.pages;

import com.DS.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class HomePage {
    public HomePage() {PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//*[.='See how we create solutions for our clients']/..")
    public WebElement createSolutions;
    @FindBy (id = "wt-cli-reject-btn")
    public WebElement cookie;


}
