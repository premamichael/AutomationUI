Feature: Basket Feature Test
  As a user
  I have to choose the product and added to basket and see the products in the basket

  Scenario:

    Given I am on HomePage using url "https://www.amazon.co.uk/"
    When I search "kids frock"
    And I click search
    