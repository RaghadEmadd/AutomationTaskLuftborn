package pages;

import org.openqa.selenium.By;

import static pages.homePage.driver;

public class searchResultPage {
    public static String transmissionTabXpath="//div[normalize-space()='Transmission']";
    //scroll down and click on transmission field
    public static String numberOfSearchItemsReturnedXpath="//h1[@class='srp-controls__count-heading']";
    public static String categoryIconXpath="//div[normalize-space()='Category']";
    public static void clickOnTransmissionTab(){
        driver.findElement(By.xpath(transmissionTabXpath)).click();
    }
}
