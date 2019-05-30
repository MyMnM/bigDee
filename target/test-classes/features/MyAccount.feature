Feature: Verify multiple scenarios on MyAccount Page
Background:
Given I open the given website
Then verify the Url

@MyAccount2 @P1BD
Scenario Outline:Verify user is able to navigate to account settings after logging with valid credentials
When I click on Login icon
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then I am successfully logged in
And click on My Information
Then it navigates to my account page

Examples:
|email                       |password      |
|bigDee@gmail.com            |automation@123|