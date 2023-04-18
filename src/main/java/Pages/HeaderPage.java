package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage {
    private WebDriver driver;

    private By cartIcon = By.xpath("//a[@id='nav-cart']");
    private By menuButton =By.xpath("//select[@id='searchDropdownBox']");
    private By searchTextBox = By.xpath("//input[@id='twotabsearchtextbox']");
    private By seachButton = By.xpath("//input[@id='nav-search-submit-button']");


    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCart(){
        driver.findElement(cartIcon).click();
        ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

    public void NavigateTo(String value){
        driver.findElement(menuButton).click();
        Select se = new Select(driver.findElement(menuButton));
        se.selectByValue(value);
        ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

    public void search(String value){
        driver.findElement(searchTextBox).clear();
        driver.findElement(searchTextBox).sendKeys(value);
        driver.findElement(seachButton).click();
        ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

    public void NavigatetoAppleStore(){
        driver.navigate().to("https://www.apple.com/in/");
        ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

}
