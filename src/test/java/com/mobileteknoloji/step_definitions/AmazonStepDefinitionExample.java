package com.mobileteknoloji.step_definitions;

import com.mobileteknoloji.pages.HomePage;
import com.mobileteknoloji.utilities.ConfigurationReader;
import com.mobileteknoloji.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AmazonStepDefinitionExample {
    HomePage homePage=new HomePage();
    @Given("user open the Amazon")
    public void user_open_the_Amazon() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user enter {string} on searchbox")
    public void user_enter_on_searchbox(String item) {

        homePage.searchBox.sendKeys(item);
        homePage.searchButton.click();
    }

    @Then("user can see related info on result")
    public void user_can_see_related_info_on_result() {

        Assert.assertTrue(homePage.resultLabel.isDisplayed());
    }


}
