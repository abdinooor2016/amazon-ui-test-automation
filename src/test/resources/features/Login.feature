Feature: Login
  As a customer, I want to login to Amazon website

  Background: Home page of Amazon

  @login
  Scenario: User successfully signs in to Amazon
    Given User clicks the user account icon in homepage
    When The user signs in with correct credentials
    Then "Hello, Test" text displayed

