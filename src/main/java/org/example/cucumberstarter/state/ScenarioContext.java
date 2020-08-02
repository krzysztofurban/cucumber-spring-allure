package org.example.cucumberstarter.state;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@ScenarioScope
@Component
public class ScenarioContext {
    private String scenarioSharedString;

    public String getScenarioSharedString() {
        return scenarioSharedString;
    }

    public void setScenarioSharedString(String scenarioSharedString) {
        this.scenarioSharedString = scenarioSharedString;
    }
}
