package org.example.cucumberstarter.steps;

import io.cucumber.java.en.When;
import org.example.cucumberstarter.state.GlobalLeakingContext;
import org.example.cucumberstarter.state.ScenarioContext;
import org.springframework.beans.factory.annotation.Autowired;

public class FirstStep {

    @Autowired
    private ScenarioContext scenarioContext;
    @Autowired
    private GlobalLeakingContext globalLeakingContext;

    @When("I put {string} to scenarioContext")
    public void iPutToScenarioContext(String text) {
        scenarioContext.setScenarioSharedString(text);
    }

    @When("I put {string} to leakingGlobalContext")
    public void iPutToLeakingGlobalContext(String text) {
        System.out.println("LeakingContext hash:" + globalLeakingContext.hashCode());
        globalLeakingContext.setLeakingString(text);
    }

    @When("I do nothing")
    public void iDoNothing() {
        System.out.println("Do nothing");
    }
}
