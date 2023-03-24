Feature: testing rahul shetty's practice page

Background: navigating to url of Rahul Shetty's page
Given user navigate to rahul shetty's page url "https://rahulshettyacademy.com/AutomationPractice/#"

Scenario: testing radio button
Given user click on radio1 button
And user click on radio2 button
And user click on radio3 button

Scenario: testing dropdown
Given user clicks on option2

Scenario: testing checkbox
Given user check on option1
Given user check on option2
Given user check on option3

Scenario: checking window handle in Rahul Shetty's pracrice page
Given user clicks on Open Window button
Then user should navigate to quickAcademy page
And user clicks on Access all our cources menu

Scenario: checking alert present on practice page
Given user send "Vikas" in the box
And user clicks on alert button
Then user should accept the alert prompted


