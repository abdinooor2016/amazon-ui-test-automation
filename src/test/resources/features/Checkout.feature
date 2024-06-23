Feature: Checkout
  As a customer, I want to checkout and purchase.

  @skipped
  Scenario: User gets card information error when invalid card information is entered
    Given User goes to checkout with an item
    #When A user enters invalid credit card information
    #Then The user gets a credit card information error

  @checkout
  Scenario: Navigate to checkout page with an item checked out
    When User goes to checkout with an item
    Then "Checkout (1 item)" text displayed
