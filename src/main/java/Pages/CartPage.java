package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Struct;

public class CartPage {
    private WebDriver driver;

    private By cartDetails = By.xpath("//h2[contains(text(),'Your Amazon Cart is empty')]");
    public By signInButton = By.xpath("//span[contains(text(),'Sign in to your account')]");
    public By signUpButton = By.xpath("//span[contains(text(),'Sign up now')]");
    public By firstSearchResults = By.xpath("//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-2\"]//img");
    private By getPrice = By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//span[@class='a-price-whole']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String cartDetailsText(){
        return driver.findElement(cartDetails).getText();
    }

    public String getProductPrice(){
        return driver.findElement(getPrice).getText();
    }

}
