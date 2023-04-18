package Tests;

import Common.CommonBaseTest;
import Pages.CartPage;
import Pages.HeaderPage;
import Pages.productPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class AmazonTest extends CommonBaseTest {
    HeaderPage headerPage;
    productPage productPage;
    CartPage cartPage;
    int Total=0;

    @Test(priority = 1)
    public void verifyEmptyCart(){
        headerPage = new HeaderPage(driver);
        cartPage = new CartPage(driver);
        headerPage.clickCart();
        Assert.assertEquals("Your Amazon Cart is empty",cartPage.cartDetailsText());
        driver.findElement(cartPage.signInButton).isDisplayed();
        driver.findElement(cartPage.signUpButton).isDisplayed();
    }

    @Test(priority = 2)
    public void addIphoneTest(){
        headerPage = new HeaderPage(driver);
        productPage = new productPage(driver);
        cartPage = new CartPage(driver);
        headerPage.NavigateTo("search-alias=electronics");
        headerPage.search("Iphone 14");
        int IphoneProductPrice = Integer.parseInt(cartPage.getProductPrice().replace(",",""));
        Total += IphoneProductPrice;
        System.out.println("Iphone 14 Price at Product Page:- " + IphoneProductPrice);
        System.out.println("Total Price :- " + Total);
        driver.findElement(cartPage.firstSearchResults).click();
        ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        System.out.println(driver.getTitle());
        productPage.clickAddtoCart();
        driver.findElement(productPage.productImage).isDisplayed();
        System.out.println("Total Price at Cart Page:- " + Total);
        driver.findElement(productPage.cartButton).click();
    }

    @Test(priority = 3)
    public void addDellLaptop(){
        headerPage = new HeaderPage(driver);
        productPage = new productPage(driver);
        cartPage = new CartPage(driver);
        headerPage.search("Dell Laptop");
        int DellProductPrice = Integer.parseInt(cartPage.getProductPrice().replace(",","").trim());
        Total += DellProductPrice;
        System.out.println("Dell Laptop Price at Product Page :- " + DellProductPrice);
        System.out.println("Total Cart Price :- "+ Total);
        driver.findElement(cartPage.firstSearchResults).click();
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(2));
        System.out.println(driver.getTitle());
        productPage.setProductUnits("2");
        productPage.clickAddtoCart();
        driver.findElement(productPage.productImage).isDisplayed();
        driver.findElement(productPage.cartButton).click();
    }
}
