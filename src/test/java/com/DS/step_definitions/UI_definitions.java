package com.DS.step_definitions;

import com.DS.pages.HomePage;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UI_definitions extends HomePage {

    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30 );
    private static int numberOfActiveApplications;



    @Given("user in on the login page")
    public void the_client_is_on_homepage()  {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
    }
    @Then("verify controls displayed")
    public void verifyControlsDisplayed() {
        assert username.isDisplayed();
        assert password.isDisplayed();
        assert login.isDisplayed();
    }

    @When("user login to main page")
    public void userLoginToMainPage() {
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        login.click();
    }

    @Then("user verifies correct url")
    public void userVerifiesCorrectUrl()  {
        String expectedUrl="https://beta-loanpro.simnang.com/client/app/index.php#/t_/797/loan/menu";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("actualUrl = " + actualUrl);
    }

    @And("user validates controls on main page")
    public void userValidatesControlsOnMainPage() {
        wait.until(ExpectedConditions.visibilityOf(reportBtn4));
        assert loans1.isDisplayed();
        assert imageCircle2.isDisplayed();
        assert newLoan3.isDisplayed();
        assert reportBtn4.isDisplayed();
        assert qaTestingTenant5.isDisplayed();
    }

    @And("user searches loans by status “Approved”")
    public void userSearchesLoansByStatusApproved()  {
       loanStatus.click();
       approved.click();
    }

    @Then("user validates loan count with status approved")
    public void userValidatesLoanCountWithStatusApproved() {

    }
}
