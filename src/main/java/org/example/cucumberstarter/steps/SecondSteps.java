package org.example.cucumberstarter.steps;

import io.cucumber.java.en.Then;
import org.example.cucumberstarter.state.GlobalLeakingContext;
import org.example.cucumberstarter.state.ScenarioContext;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class SecondSteps {

    @Autowired
    private ScenarioContext scenarioContext;
    @Autowired
    private GlobalLeakingContext globalLeakingContext;

    @Then("I can find {string} in scenarioContext")
    public void iCanFindInScenarioContext(String text) {
        assertThat(text).isEqualTo(scenarioContext.getScenarioSharedString());
    }

    @Then("I can find {string} in leakingGlobalContext")
    public void iCanFindInLeakingGlobalContext(String text) {
        System.out.println("LeakingContext hash:" + globalLeakingContext.hashCode());
        assertThat(text).isEqualTo(globalLeakingContext.getLeakingString());
    }
}

