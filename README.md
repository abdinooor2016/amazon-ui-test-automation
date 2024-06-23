# Amazon UI Automation Test

## 
This project provides a UI automation that uses Selenium, Cucumber, Java and Maven. 

## Prerequisites

* Java Development Kit
* Maven
* Chrome Browser


## Running Tests

* Clone the repository 
* Open the project any Java IDE
* Run a specific test from terminal in project root:
```shell
$ mvn clean install -Dcucumber.filter.tags="@REPLACE_WITH_TAG_IN_FEATURES_DIRECTORY"
```


## Elsevier Exercise

There are two scenarios:

Scenario 1: Login
1. Login: This test signs a user in and verifies user logs in. 
2. Run login test from project root:
```shell
$ mvn clean install -Dcucumber.filter.tags="@login"
```

Scenario 2: Checkout
1. Checkout: This test verifies an authenticated user is able to checkout an item and the user is in checkout page.
2. Run login test from project root:
```shell
$ mvn clean install -Dcucumber.filter.tags="@checkout"
```

Additional notes:

The exercise requirement for checkout was to:
1.  Add a product in bucket
2.	Checkout the product
3.	On purchase page select payment method of your type and enter any dummy values
4.	Validate the failure reason.

In the payment method section, Amazon uses cross origin frame that returns unique ID each time. So its not possible to switch to this frame due to security restrictions. I provided addCardInfo() method, that can switch to frame and enter card information as sample however this method param wouldn't know the ID amazon generates. 


