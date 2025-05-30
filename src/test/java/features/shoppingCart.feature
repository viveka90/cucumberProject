Feature: Add product to shopping cart

  Background:
    Given User should be logged into the application
  @regression
  Scenario: Products successfully added to cart
    Given User clicks on Show all Laptop and Notebook
    And user selects the product
    When user clicks on AddToCart button for the product
    And user clicks on shopping cart link
    Then MacBook should be added to the cart
