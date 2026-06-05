Feature: Checkout

Scenario: Checkout product

  Given Product is available in cart
  When User proceeds to checkout
  Then Checkout page should be displayed