package org.example.cucumberstarter.steps;

import io.cucumber.java.en.Then;
import org.example.cucumberstarter.state.ScenarioContext;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class SecondSteps {

    @Autowired
    private ScenarioContext scenarioContext;

    @Then("I can find {string} in scenarioContext")
    public void iCanFindInScenarioContext(String text) {
        assertThat(text).isEqualTo(scenarioContext.getScenarioSharedString());
    }
}
