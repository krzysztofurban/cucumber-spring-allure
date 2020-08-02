Feature: Example scenario with context

  Scenario: Scenario context, variable passing between steps
    When I put "someString" to scenarioContext
    Then I can find "someString" in scenarioContext
