Feature: Shopping Cart

Scenario: Add product to cart

  Given User searches for a product
  When User adds product to cart
  Then Product should be available in cart