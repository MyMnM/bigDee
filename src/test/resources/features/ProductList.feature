
Feature: Verify multiple scenarios on Product List page
Background:
Given I open the given website
Then verify the Url
When I navigate to product List page
  
    
    @ProductList  @P1BD
    Scenario:Validate Sort By dropdoown is working fine and page sorts as per selected option ie:Popularity,Recency,Low to High,High to Low
    When I select A to Z sortby value
    Then products gets listed as per A to Z   
    When I select Z to A sortby value
    Then products gets listed as per Z to A 
    
    @ProductList @P1BD
    Scenario:Validate Quick view functionality on every product
    When I hover the mouse over the product
    Then it displays Quick view button
   
    
    
    