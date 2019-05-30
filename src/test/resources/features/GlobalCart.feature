
Feature: Verify multiple scenarios on Global Cart Page
Background:
Given I open the given website
Then verify the Url

@GlobalCart @P1
Scenario:Validate if there is item in global cart then price should be total proce of all the items in cart and badge counter should reflect the number of items in cart 
When I navigate to Product Detail Page
When I click on Add to Cart button
Then the product gets added to cart
And badge counter should reflect the number of items in cart
Then price should be total price of all the items in cart 






