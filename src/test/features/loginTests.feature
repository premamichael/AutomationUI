Feature: Login Feature Test

  As a user
  I should be able to login and use the app

  @login @regression @smoke
  Scenario: Verify login with correct username and password

    Given I am on HomePage using url "https://www.saucedemo.com" with title "Swag Labs"
    When I enter username "standard_user" and password "secret_sauce"
    And I click login button
    Then I should have logged in successfully and gets redirected to products page with title "Products"

  @login @regression
  Scenario: Verify login with invalid username and password

    Given I am on HomePage using url "https://www.saucedemo.com" with title "Swag Labs"
    When I enter username "invalid_user" and password "invalid_password"
    And I click login button
    Then I should not be able to login and gets error message as "Epic sadface: Username and password do not match any user in this service"

