Feature: Verify Sort Feature

  As a user
  I should be able to sort the products

  @sort @regression
  Scenario Outline: Verify sort with price

    Given I am on HomePage using url "https://www.saucedemo.com" with title "Swag Labs"
    When I enter username "standard_user" and password "secret_sauce"
    And I click login button
    And I choose sort option "<priceSortOption>"
    Then I should see the products sorted accordingly with price "<priceOnTop>" listed on top

    Examples:
      | priceSortOption     | priceOnTop |
      | Price (low to high) | 7.99       |
      | Price (high to low) | 49.99      |