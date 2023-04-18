# kwglobal_AmazonAssisment
Amazon Automation :

This project aims to automate few features of Amazon website.

Technology Stack :

Selenium Webdriver
Java
TestNG
Allure Report

To Execute Test run :- 'mvn clean compile test'

Allure results will appear in allure-results folder.
To generate html report and automatically open it in a web browser, run the following command:
`allure serve allure-results`

Following Features Automted:
1. Open https://www.amazon.in/ in Chrome Browser
2. Click on cart and verify Your Amazon Cart is empty is displayed with Sign in to your account and Sign up now button
3. Click on Electronics from dropdown menu and Search Iphone 14
4. Add to Cart above product and verify Added to Cart displayed with correct Cart subtotal with item count.
5. Click on above product image available in Added to Cart section.

6. Click on Visit the Apple Store link, navigate to APPLEWATCH menu and click on any Series 8 watch from submenu and Click on any related available watch and perform Add to Cart 3 Units
7. Verify Added to Cart section displays correct product details.

8. Click on Cart and Search for Dell Laptop and Add to Cart 2 units First Laptop
9. Click on Cart, verify all Cart Items, and verify correct Cart information is getting displayed.
10. Click on cart again and reduce quantity of AppleWatch by 1 and verify all Shopping cart details are proper


Note:- Could not Automate step no 6 & 7 as educate information was not there.

Clone this project.
Run .xml file.
