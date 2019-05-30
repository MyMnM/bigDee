
Feature: Verify multiple scenarios on Checkout Page
Background:
Given I open the given website
Then verify the Url
When I navigate to Product Detail Page
When I click on Add to Cart button
Then the product gets added to cart
When I click on Checkout button
And I continue as a Guest

@Checkout @P1BD
Scenario:Verify Login link is there if User continue as a guest
Then Login link is present there

@Checkout @P1BD
Scenario:Verify user is able to place order if all mandatory fields are filled 
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I enter all the mandatory valid card information and click on Next button
When I click on Billing Address Same as Shipping
And I enter valid email id
And I click on Place order button
Then Order gets placed successfully