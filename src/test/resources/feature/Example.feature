# UTF-8

Feature: Open Google

  Background:
    Given acess the page "https://www.google.com/"

  @Test
  Scenario: A scenario
    When search about "news"
    Then click in the first search

