Feature: Add the product to the Shopping Cart

  Scenario: Shopping Cart
  As a user I want to add the needed product to the shopping cart, so that I could buy it

    Given I am on the https://rozetka.com.ua/ page
   And I have found the needed product

   When I click “Buy” button

   Then I successfully added the product to the shopping cart
   And I see a shopping cart modal window with the added item
