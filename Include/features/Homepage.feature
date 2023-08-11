#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test Home screen functionality
  I want to use this template for my feature file

  @tag1
  Scenario: Verify User able to perform mouseover operations on Petronas Web
    Given user is on Petronas Homepage
    When user taps on Our Passion Link
    Then user verifies Our Passion screen
// Given user is on Petronas Homepage
WebUI.openBrowser('')

// When user taps on Our Passion Link
WebUI.click(findTestObject('Object Repository/Homepage/Our Passion Link'))

// Then user verifies Our Passion screen
WebUI.verifyElementVisible(findTestObject('Object Repository/Our Passion Screen'))


   