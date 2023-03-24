Feature: checking functionality of qrm website

Background: some important steps to login
Given user navigate to qrm login page url
When user enters username and password in boxes
Then user hits on qrl login button

Scenario: login functionality
Then user navigate to home page of qrm page

@smoke
Scenario: Checking forgot password link
Given user navigate to qrm login page url
When user clicks on hrm forgot password link
Then user navigates to reset password page

Scenario: adding user in admin
When user clicks on Admin button on home page
And user clicks on add button on user management page
And user sets user role as ESS from dropdown
And user enter Employee name
And user sets Status as disabled
Then user clicks on save button

Scenario: search user
When user clicks on Admin button on home page
When user enters "vikas" in username searchbox
And user hit on search button
Then user no found message should be displayed
