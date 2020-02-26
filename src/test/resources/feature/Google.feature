# UTF-8

#noinspection CucumberUndefinedStep
Feature: Open Google

  Background:
    Given acess the page "https://www.google.com/"

  @GoogleTest
  Scenario: A scenario
    When search about "news"
    And click to search
    Then click in the first search
    And close application

