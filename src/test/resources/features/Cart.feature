
Feature: Verify multiple scenarios on Cart Page
Background:
Given I open the given website
Then verify the Url

@Cart @P1BD
Scenario:Verify Item / Quantity / Price / Item Total/Subtotal/Total fields and Product code is displaying in cart page
When I navigate to Product Detail Page
When I click on Add to Cart button
Then the product gets added to cart
When I click on View cart button
Then it navigates to basket page
Then Item / Quantity / Price / Item Total/Subtotal/Total fields are displaying in cart page









