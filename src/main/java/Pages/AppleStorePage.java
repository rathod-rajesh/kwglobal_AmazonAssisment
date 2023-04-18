package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleStorePage {
    private WebDriver driver;

    private By watchMenu = By.xpath("//span[@class='globalnav-link-text'][normalize-space()='Watch']");
    private By appleWatchSeries8 = By.xpath("//span[@class='chapternav-label'][normalize-space()='Apple Watch Series 8']");
    private By buyButton = By.xpath("//a[@aria-label='Buy Apple Watch Series 8'][normalize-space()='Buy']");
    private By shopButton = By.xpath("//a[@aria-label='Shop Apple Watch Series 8']");



    public AppleStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navtigateToSeries8(){
        driver.findElement(watchMenu).click();
        driver.findElement(appleWatchSeries8).click();

    }

}
