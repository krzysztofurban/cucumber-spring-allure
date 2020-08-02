package org.example.cucumberstarter.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.example.cucumberstarter.TestConfig;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = TestConfig.class)
public class CucumberSpringConfiguration {

}
