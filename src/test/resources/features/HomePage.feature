
Feature: Verify multiple scenarios on Home Page
Background:
Given I open the given website
Then verify the Url

    @HomePage @P1BD
    Scenario:Verify click on logo of the website is working and redirect on home page        
    When I click on logo of the website 
    Then  it redirects me to the Home Page
    
    @HomePage @P1BD
  	Scenario Outline:Verify search bar is working and give auto suggestions for what user types eg:product name   
    When I enter the value "<search>"in Search bar
    Then  give auto suggestions for what user types
    
    Examples:
    |search   |
    |saddle   |       
    
    @HomePage @P1BD
    Scenario: Verify lite Login icon is clickable and working fine    
    When I click on Login icon
    Then it opens new Shopper Window
    
    
    @HomePage @P1BD
    Scenario:Verify cart icon is present and on hovering icon should show the items present in cart    
    When I hover on the cart icon
    Then it shows the cart contents    
    
    @HomePage @P1BD
    Scenario:Verify all the parent categories are visible and redirects to specific page   
    When I click on Supplements menu
    Then it redirects to Supplements page
    When I click on horse care menu
    Then it redirects to horse care page
    When I click on leg protection menu
    Then it redirects to leg protection page
    When I click on horse wear menu
    Then it redirects to horse wear page
    When I click on track and equipment menu
    Then it redirects to track and equipment page
    When I click on farm and barn menu
    Then it redirects to farm and barn page
    When I click on apparel and gift menu
    Then it redirects to apparel and gift page
    When I click on pet supplies menu
    Then it redirects to pet supplies page
    When I click on sale menu
    Then it redirects to on sale page
    When I click on shop by brand menu
    Then it redirects to shop by brand page
        
    @HomePage @P1BD
    Scenario Outline:Validate new shopper sign up is working in lite login
    When I click on Login icon
    And I click on New shooper link
    And I enter username as "<username>" password as "<password>" re-enter password as "<password>" security answer as "<securityAnswer>"
    When I click on Register button
    Then it is sign up successfully
    
    Examples:
    |username                      |password      |securityAnswer|
    |asdef@gmail.com               |automation@123|fzr           |   
    
    
    @HomePage @P1BD
    Scenario Outline:Validate logout option is working in case user logged in already
    When I click on Login icon
    And I enter username as "<email>" and password as "<password>"
    And I click on Sign in button     
    When I click on logout 
    Then it logged out successfully
    
    Examples:
    |email                       |password      |
    |bigDee@gmail.com            |automation@123|