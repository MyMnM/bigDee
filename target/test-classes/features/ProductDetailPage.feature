
Feature: Verify multiple scenarios on Product Detail Page
Background:
Given I open the given website
Then verify the Url
When I navigate to Product Detail Page

@PDP @P1BD
Scenario:Validate Add to cart button is working
When I click on Add to Cart button
Then the product gets added to cart

@PDP @P1BD
Scenario:Validate Recently view Item section / More to love section  is there
Then You May also like section is visible
Then Recently view Item section is visible



