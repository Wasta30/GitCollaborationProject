package com.practice.step_definitions;

import com.practice.utilities.Driver;
import io.cucumber.java.en.Given;

public class NavigateStepDefinition {
    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        url = "https://www.beymen.com/";
        Driver.getDriver().get(url);

    }
}
