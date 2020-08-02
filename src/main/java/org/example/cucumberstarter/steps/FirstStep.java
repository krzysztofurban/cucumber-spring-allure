package org.example.cucumberstarter.steps;

import io.cucumber.java.en.When;
import org.example.cucumberstarter.state.ScenarioContext;
import org.springframework.beans.factory.annotation.Autowired;

public class FirstStep {

    @Autowired
    private ScenarioContext scenarioContext;

    @When("I put {string} to scenarioContext")
    public void iPutToScenarioContext(String text) {
        scenarioContext.setScenarioSharedString(text);
    }
}
