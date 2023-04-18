package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class productPage {
    private WebDriver driver;

    public By addToCartButton = By.xpath("//input[@id='add-to-cart-button']");
    private By sideModal = By.xpath("//div[@id='attach-desktop-sideSheet']");
    public By productImage = By.xpath("//div[@id='attach-added-to-cart-message']//img");
    public By cartButton = By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']");
    private By productCartPrice = By.xpath("//div[@id='attach-desktop-sideSheet']//span[@id='attach-accessory-cart-subtotal']");
    private By productunitsDropdown = By.xpath("//select[@id='quantity']");

    public productPage(WebDriver driver) {
        this.driver = driver;
    }

    public String productCartprice(){
        String price = driver.findElement(productCartPrice).getText();
        price= price.replace(",","");
        price=price.replace("₹","");
        return price;
    }

    public void setProductUnits(String value){
        driver.findElement(productunitsDropdown).click();
        Select se = new Select(driver.findElement(productunitsDropdown));
        se.selectByValue(value);
    }

    public void clickAddtoCart(){
        driver.findElement(addToCartButton).click();
        ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

}

