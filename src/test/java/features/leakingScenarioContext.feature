Feature: Example scenario with context

  Scenario: Save to leaking scenario context
    When I put "someString" to leakingGlobalContext
    Then I can find "someString" in leakingGlobalContext

  Scenario: Load from leaking scenario context
    When I do nothing
    Then I can find "someString" in leakingGlobalContext