package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static pages.homePage.*;
import static pages.searchResultPage.*;

public class homePageStepDefs {
    public static String expectedHomePageTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
    public static String expectedSearchResultTitle = "Mazda MX-5 for sale | eBay";

    @Given("^user visits website$")
    public void user_visits_website(){
        driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");
    }
    @And("^validate that user is on homepage$")
    public void validate_that_user_is_on_homepage(){
        String actualTitle = driver.getTitle();

        // Assertion to compare the actual title with the expected title
        Assert.assertEquals(actualTitle, expectedHomePageTitle);

        System.out.println("Title verification successful!");

    }
    @When("^user searches for required item$")
    public void user_searches_for_required_item(){
        clickOnSearchField();
        enterTextToSearch();
        clickOnSearchButton();
    }
    @Then("^validate that results are displayed$")
    public void validate_that_results_are_displayed(){
        //wait to locate element before scrolling
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(categoryIconXpath)));

        // to validate the number of returned results from search
       // List<WebElement> elements = driver.findElements(By.className("information"));
        String result = driver.findElement(By.xpath(numberOfSearchItemsReturnedXpath)).getText().split(" ")[0];
        System.out.println("number of results returned is .." + result);
        // to scroll down first then click on transmission tab
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        String actualSearchResultTitle = driver.getTitle();

        // Assertion to compare the actual title with the expected title
        Assert.assertEquals(actualSearchResultTitle, expectedSearchResultTitle);
        System.out.println("Title verification successful!");
        clickOnTransmissionTab();
    }


}
