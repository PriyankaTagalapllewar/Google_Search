
Feature: checking modole Lume Bags

Scenario: Ordering overnight duffer bag
Given user navigate to url "https://magento.softwaretestingboard.com/"
When user clicks Bags option from Gear Molule dropdown
Then user should navigate to required page
And user clicks on Overnight duffer bag
Then user should navigate to required page
And user clicks on Add To Card button
Then user should be able to see "You added Overnight Duffle to your " this message