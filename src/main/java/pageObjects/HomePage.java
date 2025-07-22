package pageObjects;

import actoinDriver.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BaseClass.driver;

public class HomePage {
    Action action = new Action();

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;
    @FindBy(xpath = "//input[@name='oooq']")
    WebElement searchProductBox;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public boolean SearchProduct(String ProductName) throws InterruptedException {
//        System.out.println(action.getTitle(driver));
//        driver.findElement(By.xpath("//input[@name='q']")).click();
        // Check if the search product box is displayed
        Thread.sleep(20000);
        if (action.isDisplayed(driver,searchProductBox)) {
            // Click on the search product box
            action.click(driver, searchProductBox);

            // Enter the product name
            action.type(searchProductBox,ProductName);
            // Return true if the product name is entered successfully
            return true;
        }
            // If the search product box is not displayed, return false
        return false;
    }
    public SearchResultPage clickSearchButton(){
        action.click(driver,searchButton);
        return new SearchResultPage();
    }

}
