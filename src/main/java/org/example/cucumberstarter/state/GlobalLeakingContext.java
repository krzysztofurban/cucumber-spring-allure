package org.example.cucumberstarter.state;

import org.springframework.stereotype.Component;

@Component
public class GlobalLeakingContext {
    private String leakingString;

    public String getLeakingString() {
        return leakingString;
    }

    public void setLeakingString(String leakingString) {
        this.leakingString = leakingString;
    }
}
