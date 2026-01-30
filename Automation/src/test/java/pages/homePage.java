package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {
    public static WebDriver driver;
   public static String searchFieldId="gh-ac";
   public static String searchButtonId="gh-search-btn";
    public static void clickOnSearchField(){
        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();
//        driver.get("https://www.ebay.com/");
        driver.findElement(By.id(searchFieldId)).click();
    }
    public static void enterTextToSearch(){
        driver.findElement(By.id(searchFieldId)).sendKeys("mazda mx-5");
    }
    public static void clickOnSearchButton(){
        driver.findElement(By.id(searchButtonId)).click();
    }
}
